package mx.uv.compras.Factura;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class FacturaConfig {

    @Bean
    public Jaxb2Marshaller marshallerFactura() {
        Jaxb2Marshaller marshallerFactura = new Jaxb2Marshaller();
        marshallerFactura.setContextPath("vv.mx.uv.consumo.wsdl");
        return marshallerFactura;
    }

    @Bean
    public FacturaCliente facturaCliente(@Qualifier("marshallerFactura") Jaxb2Marshaller marshallerFactura) {
        FacturaCliente c = new FacturaCliente();
        c.setDefaultUri("https://facturas-production.up.railway.app/ws/facturas");
        c.setMarshaller(marshallerFactura);
        c.setUnmarshaller(marshallerFactura);
        return c;
    }

}
