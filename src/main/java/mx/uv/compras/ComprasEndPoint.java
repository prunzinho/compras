package mx.uv.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.compras.Factura.FacturaCliente;
import mx.uv.compras.Inventario.InventarioCliente;
import mx.uv.t4is.compras.DependenciaProductosRequest;
import mx.uv.t4is.compras.DependenciaProductosResponse;
import mx.uv.t4is.compras.InformacionVendedorType;
import mx.uv.t4is.compras.OrdenCompraType;
import mx.uv.t4is.compras.ProductosType;
import mx.uv.t4is.compras.SolicitarCompraRequest;
import mx.uv.t4is.compras.SolicitarCompraResponse;
import mx.uv.t4is.compras.SolicitudFacturaRequest;
import mx.uv.t4is.compras.SolicitudFacturaResponse;
import vv.mx.uv.consumo.wsdl.GenerarFacturaRequest;
import vv.mx.uv.consumo.wsdl.GenerarFacturaResponse;
import xx.mx.uv.consumo.wsdl.GenerarFolioRequest;
import xx.mx.uv.consumo.wsdl.GenerarFolioResponse;
import xx.mx.uv.consumo.wsdl.GenerarFolioRequest.Orden;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

@Endpoint
public class ComprasEndPoint {
    private static int orderCounter = 1;
    private static ArrayList<OrdenCompraType> ordenDeCompra = new ArrayList<>();
    private String IDFactura;

    @Autowired
    private InventarioCliente inventarioCliente;

   @Autowired
    private FacturaCliente facturaCliente;

    @PayloadRoot(localPart = "DependenciaProductosRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public DependenciaProductosResponse recibirProductos(@RequestPayload DependenciaProductosRequest request) {
        DependenciaProductosResponse response = new DependenciaProductosResponse();

        int orderNumber = orderCounter++;
        final BigDecimal[] totalPrice = { BigDecimal.ZERO };
        LocalDate fechaCompra = LocalDate.now();

        // Conversión de LocalDate a XMLGregorianCalendar
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(fechaCompra.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xmlGregorianCalendar;
        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {
            // Manejo de excepciones si hay algún error en la conversión
            e.printStackTrace();
            xmlGregorianCalendar = null;
        }

        List<ProductosType.Producto> productosConvertidos = new ArrayList<>();
        for (DependenciaProductosRequest.Productos.Producto producto : request.getProductos().getProducto()) {
            ProductosType.Producto productoConvertido = new ProductosType.Producto();
            productoConvertido.setNombre(producto.getNombre());
            productoConvertido.setCantidad(producto.getCantidad());
            productoConvertido.setPrecioUnitario(producto.getPrecioUnitario());

            // Agregar la información del vendedor
            InformacionVendedorType informacionVendedor = new InformacionVendedorType();
            informacionVendedor.setNombre(producto.getInformacionVendedor().getNombre());
            informacionVendedor.setDireccion(producto.getInformacionVendedor().getDireccion());
            productoConvertido.setInformacionVendedor(informacionVendedor);

            productosConvertidos.add(productoConvertido);

            BigDecimal productTotal = producto.getPrecioUnitario().multiply(new BigDecimal(producto.getCantidad()));
            totalPrice[0] = totalPrice[0].add(productTotal);
        }

        BigDecimal precioTotal = totalPrice[0];

        // Crear un objeto OrdenCompraType y agregarlo al ArrayList ordenDeCompra
        OrdenCompraType ordenCompra = new OrdenCompraType();
        ProductosType productosType = new ProductosType();
        productosType.getProducto().addAll(productosConvertidos);
        ordenCompra.setProductos(productosType);
        ordenCompra.setPrecioTotal(precioTotal);
        ordenCompra.setFechaCompra(xmlGregorianCalendar); // Asignar la fecha convertida

        ordenDeCompra.add(ordenCompra);

        // Construir el mensaje de respuesta con los detalles de la orden de compra
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Productos recibidos correctamente. Orden de Compra No: ")
                .append(orderNumber)
                .append(", fecha: ")
                .append(fechaCompra)
                .append(", precio total: ")
                .append(precioTotal)
                .append(".\nDetalles de la orden de compra:\n");

        for (ProductosType.Producto producto : productosConvertidos) {
            mensaje.append("Producto: ")
                    .append(producto.getNombre())
                    .append(", Cantidad: ")
                    .append(producto.getCantidad())
                    .append(", Precio Unitario: ")
                    .append(producto.getPrecioUnitario())
                    .append(", Vendedor: ")
                    .append(producto.getInformacionVendedor().getNombre())
                    .append(", Dirección: ")
                    .append(producto.getInformacionVendedor().getDireccion())
                    .append("\n");
        }

        response.setMensaje(mensaje.toString());

        return response;
    }

    @PayloadRoot(localPart = "SolicitudFacturaRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public SolicitudFacturaResponse mandarProductosFactura(@RequestPayload SolicitudFacturaRequest request) {
        SolicitudFacturaResponse response = new SolicitudFacturaResponse();

        // Obtener la información de la orden de compra desde la lista ordenDeCompra
        if (!ordenDeCompra.isEmpty()) {
            OrdenCompraType ordenCompra = ordenDeCompra.get(ordenDeCompra.size() - 1); // Obtener la última orden de compra
            response.setMensaje(
                    "Producto recibido. Se generará la factura para la orden de compra No: "
                            + ordenDeCompra.size()
                            + ". Detalles de la orden:\n"
                            + "Fecha de compra: "
                            + ordenCompra.getFechaCompra()
                            + "\nPrecio total: "
                            + ordenCompra.getPrecioTotal()
                            + "\nProductos:\n");

            for (ProductosType.Producto producto : ordenCompra.getProductos().getProducto()) {
                response.setMensaje(response.getMensaje() +
                        "Nombre: " + producto.getNombre()
                        + ", Cantidad: " + producto.getCantidad()
                        + ", Precio Unitario: " + producto.getPrecioUnitario()
                        + ", Vendedor: " + producto.getInformacionVendedor().getNombre()
                        + ", Dirección: " + producto.getInformacionVendedor().getDireccion()
                        + "\n");
            }
        } else {
            // Manejo de caso en el que no hay orden de compra disponible
            response.setMensaje("No hay información de orden de compra disponible para generar la factura.");
        }

        return response;
    } 

    @PayloadRoot(localPart = "SolicitarCompraRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public SolicitarCompraResponse solicitarCompra(@RequestPayload SolicitarCompraRequest request) {
        SolicitarCompraResponse response = new SolicitarCompraResponse();
        //Genera Orden
        Orden orden = obtenerOrdenRequest(request);
        
        //Genera Factura
        GenerarFacturaResponse facturaResponse = facturaCliente.generarFactura(estructurarFacturaRequest(request));
        //Obtenemos el ID de factura
        System.out.println(facturaResponse.getUUID());

        GenerarFolioResponse folioResponse = inventarioCliente.consultarFactura(facturaResponse.getUUID(), orden);
        System.out.println(folioResponse.getMensaje());

        if(folioResponse.getMensaje().equals("Los folios han sido creados")){
            response.setMensaje(folioResponse.getMensaje() + " con número de orden " + orden.getNumOrden());
        }else{
            response.setMensaje(folioResponse.getMensaje());
        }

        return response;
    }



    private static Orden obtenerOrdenRequest(SolicitarCompraRequest request) {
        Orden orden = new Orden();
        orden.setNumOrden(UUID.randomUUID().toString());
        Orden.InformacionComprador informacionComprador = new Orden.InformacionComprador();
        informacionComprador.setNombre(request.getInformacionComprador().getNombre());
        informacionComprador.setDireccion(request.getInformacionComprador().getDireccion());
        orden.setInformacionComprador(informacionComprador);

        Orden.InformacionVendedor informacionVendedor = new Orden.InformacionVendedor();
        informacionVendedor.setNombre(request.getInformacionVendedor().getNombre());
        informacionVendedor.setDireccion(request.getInformacionVendedor().getDireccion());
        orden.setInformacionVendedor(informacionVendedor);

        Date fechaCompra = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        orden.setFechaCompra(sdf.format(fechaCompra));

        Orden.Productos.Producto productoOrden;
        Orden.Productos productos = new Orden.Productos();
        double precioTotal = 0;
        for (SolicitarCompraRequest.Productos.Producto producto : request.getProductos().getProducto()) {
            productoOrden = new Orden.Productos.Producto();
            productoOrden.setCantidad(Double.valueOf(producto.getCantidad()));
            productoOrden.setNombre(producto.getNombre());
            productoOrden.setPrecioUnitario(Double.valueOf(producto.getPrecioUnitario()));
            precioTotal += productoOrden.getCantidad() * productoOrden.getPrecioUnitario();
            productos.getProducto().add(productoOrden);
        }
        orden.setProductos(productos);
        orden.setPrecioTotal(String.valueOf(precioTotal));
        
        
        return orden;
    }

    private static GenerarFacturaRequest estructurarFacturaRequest(SolicitarCompraRequest request){
        GenerarFacturaRequest facturaRequest = new GenerarFacturaRequest();
        GenerarFacturaRequest.DatosVendedor datosVendedor = new GenerarFacturaRequest.DatosVendedor();
        datosVendedor.setNombre(request.getInformacionVendedor().getNombre());
        datosVendedor.setDireccion(request.getInformacionVendedor().getDireccion());
        facturaRequest.setDatosVendedor(datosVendedor);

        GenerarFacturaRequest.Productos.Producto productoFactura;
        GenerarFacturaRequest.Productos productosFacturas = new GenerarFacturaRequest.Productos();
        for (SolicitarCompraRequest.Productos.Producto producto : request.getProductos().getProducto()) {
            productoFactura = new GenerarFacturaRequest.Productos.Producto();
            productoFactura.setNombre(producto.getNombre());
            productoFactura.setCantidad(Double.valueOf(producto.getCantidad()));
            productoFactura.setPrecioUnitario(Double.valueOf(producto.getPrecioUnitario()));
            productosFacturas.getProducto().add(productoFactura);
        }
        facturaRequest.setProductos(productosFacturas);

        return facturaRequest;
    }
    
}
