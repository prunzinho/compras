package mx.uv.compras;

import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.compras.DependenciaProductosRequest;
import mx.uv.t4is.compras.DependenciaProductosResponse;
import mx.uv.t4is.compras.SolicitudFacturaRequest;
import mx.uv.t4is.compras.SolicitudFacturaResponse;
import mx.uv.t4is.compras.DependenciaProductosRequest.Productos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Endpoint
public class ComprasEndPoint {
    private static int orderCounter = 1;

    @PayloadRoot(localPart = "DependenciaProductosRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public DependenciaProductosResponse recibirProductos(@RequestPayload DependenciaProductosRequest request) {
        DependenciaProductosResponse response = new DependenciaProductosResponse();

        int orderNumber = orderCounter++;

        final BigDecimal[] totalPrice = { BigDecimal.ZERO };
        LocalDate fechaCompra = LocalDate.now();

        List<String> productFolios = request.getProductos().getProducto().stream().map(producto -> {
            BigDecimal productTotal = producto.getPrecioUnitario().multiply(new BigDecimal(producto.getCantidad()));
            totalPrice[0] = totalPrice[0].add(productTotal);
            return "Folio-" + producto.getNombre() + "-" + orderNumber;
        }).collect(Collectors.toList());

        BigDecimal precioTotal = totalPrice[0];

        response.setMensaje("Productos recibidos correctamente. Orden de Compra No: " + orderNumber + "fecha "
                + fechaCompra + "precio : " + precioTotal);
        return response;
    }

    @PayloadRoot(localPart = "SolicitudFacturaRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public SolicitudFacturaResponse enviarProductosFacturas(@RequestPayload SolicitudFacturaRequest request) {
        SolicitudFacturaResponse response = new SolicitudFacturaResponse();

        return response;
    }
}
