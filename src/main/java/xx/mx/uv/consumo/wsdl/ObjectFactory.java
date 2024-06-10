
package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xx.mx.uv.consumo.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xx.mx.uv.consumo.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarFolioRequest }
     * 
     */
    public GenerarFolioRequest createGenerarFolioRequest() {
        return new GenerarFolioRequest();
    }

    /**
     * Create an instance of {@link GenerarFolioRequest.Orden }
     * 
     */
    public GenerarFolioRequest.Orden createGenerarFolioRequestOrden() {
        return new GenerarFolioRequest.Orden();
    }

    /**
     * Create an instance of {@link GenerarFolioRequest.Orden.Productos }
     * 
     */
    public GenerarFolioRequest.Orden.Productos createGenerarFolioRequestOrdenProductos() {
        return new GenerarFolioRequest.Orden.Productos();
    }

    /**
     * Create an instance of {@link GenerarFolioResponse }
     * 
     */
    public GenerarFolioResponse createGenerarFolioResponse() {
        return new GenerarFolioResponse();
    }

    /**
     * Create an instance of {@link GenerarFolioRequest.Orden.InformacionComprador }
     * 
     */
    public GenerarFolioRequest.Orden.InformacionComprador createGenerarFolioRequestOrdenInformacionComprador() {
        return new GenerarFolioRequest.Orden.InformacionComprador();
    }

    /**
     * Create an instance of {@link GenerarFolioRequest.Orden.InformacionVendedor }
     * 
     */
    public GenerarFolioRequest.Orden.InformacionVendedor createGenerarFolioRequestOrdenInformacionVendedor() {
        return new GenerarFolioRequest.Orden.InformacionVendedor();
    }

    /**
     * Create an instance of {@link GenerarFolioRequest.Orden.Productos.Producto }
     * 
     */
    public GenerarFolioRequest.Orden.Productos.Producto createGenerarFolioRequestOrdenProductosProducto() {
        return new GenerarFolioRequest.Orden.Productos.Producto();
    }

}
