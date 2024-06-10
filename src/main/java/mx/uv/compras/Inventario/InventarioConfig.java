package mx.uv.compras.Inventario;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@ComponentScan
@Configuration
public class InventarioConfig {

    @Bean
    public Jaxb2Marshaller marshallerInventario(){
        Jaxb2Marshaller marshallerInventario = new Jaxb2Marshaller();
        marshallerInventario.setContextPath("xx.mx.uv.consumo.wsdl");
        return marshallerInventario;
    }

    @Bean
    public InventarioCliente inventarioCliente(@Qualifier("marshallerInventario") Jaxb2Marshaller marshallerInventario){
        InventarioCliente c = new InventarioCliente();
        c.setDefaultUri("https://inventarioserviciointegracion-production.up.railway.app/ws/inventario");
        c.setMarshaller(marshallerInventario);
        c.setUnmarshaller(marshallerInventario);
        return c;
    }
    
}
