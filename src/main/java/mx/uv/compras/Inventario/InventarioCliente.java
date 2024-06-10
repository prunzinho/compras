package mx.uv.compras.Inventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.consumo.wsdl.GenerarFolioRequest;
import xx.mx.uv.consumo.wsdl.GenerarFolioResponse;
import xx.mx.uv.consumo.wsdl.GenerarFolioRequest.Orden;

@Component
public class InventarioCliente extends WebServiceGatewaySupport{
   
    @Autowired
    private Jaxb2Marshaller marshallerInventario;

    public GenerarFolioResponse consultarFactura(String idFactura, Orden orden) {
        GenerarFolioRequest request = new GenerarFolioRequest();
        request.setUUIDFactura(idFactura);
        request.setOrden(orden);
        return (GenerarFolioResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request, new SoapActionCallback("http://localhost:8080/ws/inventario"));
    }


    
}
