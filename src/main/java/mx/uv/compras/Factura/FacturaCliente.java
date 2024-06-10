package mx.uv.compras.Factura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import vv.mx.uv.consumo.wsdl.GenerarFacturaRequest;
import vv.mx.uv.consumo.wsdl.GenerarFacturaResponse;

@Component
public class FacturaCliente extends WebServiceGatewaySupport {

    @Autowired
    private Jaxb2Marshaller marshallerFactura; // Asegúrate de tener esta dependencia inyectada correctamente

    public GenerarFacturaResponse generarFactura(GenerarFacturaRequest request) {
        return (GenerarFacturaResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request, new SoapActionCallback("http://localhost:8180/ws/facturas"));
    }

}
