
package vv.mx.uv.consumo.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Productos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Producto" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatosVendedor"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrecioTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FechaGeneracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uuid",
    "productos",
    "datosVendedor",
    "precioTotal",
    "fechaGeneracion"
})
@XmlRootElement(name = "recuperarFacturaResponse")
public class RecuperarFacturaResponse {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "Productos", required = true)
    protected RecuperarFacturaResponse.Productos productos;
    @XmlElement(name = "DatosVendedor", required = true)
    protected RecuperarFacturaResponse.DatosVendedor datosVendedor;
    @XmlElement(name = "PrecioTotal")
    protected double precioTotal;
    @XmlElement(name = "FechaGeneracion", required = true)
    protected String fechaGeneracion;

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad productos.
     * 
     * @return
     *     possible object is
     *     {@link RecuperarFacturaResponse.Productos }
     *     
     */
    public RecuperarFacturaResponse.Productos getProductos() {
        return productos;
    }

    /**
     * Define el valor de la propiedad productos.
     * 
     * @param value
     *     allowed object is
     *     {@link RecuperarFacturaResponse.Productos }
     *     
     */
    public void setProductos(RecuperarFacturaResponse.Productos value) {
        this.productos = value;
    }

    /**
     * Obtiene el valor de la propiedad datosVendedor.
     * 
     * @return
     *     possible object is
     *     {@link RecuperarFacturaResponse.DatosVendedor }
     *     
     */
    public RecuperarFacturaResponse.DatosVendedor getDatosVendedor() {
        return datosVendedor;
    }

    /**
     * Define el valor de la propiedad datosVendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link RecuperarFacturaResponse.DatosVendedor }
     *     
     */
    public void setDatosVendedor(RecuperarFacturaResponse.DatosVendedor value) {
        this.datosVendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotal.
     * 
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Define el valor de la propiedad precioTotal.
     * 
     */
    public void setPrecioTotal(double value) {
        this.precioTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGeneracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * Define el valor de la propiedad fechaGeneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaGeneracion(String value) {
        this.fechaGeneracion = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "direccion"
    })
    public static class DatosVendedor {

        @XmlElement(name = "Nombre", required = true)
        protected String nombre;
        @XmlElement(name = "Direccion", required = true)
        protected String direccion;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Producto" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "producto"
    })
    public static class Productos {

        @XmlElement(name = "Producto", required = true)
        protected List<RecuperarFacturaResponse.Productos.Producto> producto;

        /**
         * Gets the value of the producto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the producto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProducto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecuperarFacturaResponse.Productos.Producto }
         * 
         * 
         */
        public List<RecuperarFacturaResponse.Productos.Producto> getProducto() {
            if (producto == null) {
                producto = new ArrayList<RecuperarFacturaResponse.Productos.Producto>();
            }
            return this.producto;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nombre",
            "cantidad",
            "precioUnitario"
        })
        public static class Producto {

            @XmlElement(name = "Nombre", required = true)
            protected String nombre;
            @XmlElement(name = "Cantidad")
            protected double cantidad;
            @XmlElement(name = "PrecioUnitario")
            protected double precioUnitario;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             */
            public double getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             */
            public void setCantidad(double value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad precioUnitario.
             * 
             */
            public double getPrecioUnitario() {
                return precioUnitario;
            }

            /**
             * Define el valor de la propiedad precioUnitario.
             * 
             */
            public void setPrecioUnitario(double value) {
                this.precioUnitario = value;
            }

        }

    }

}
