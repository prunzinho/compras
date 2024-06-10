
package xx.mx.uv.consumo.wsdl;

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
 *         &lt;element name="UUIDFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Orden"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Productos"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Producto" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                                       &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PrecioTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NumOrden" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FechaCompra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="InformacionComprador"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InformacionVendedor"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "uuidFactura",
    "orden"
})
@XmlRootElement(name = "GenerarFolioRequest")
public class GenerarFolioRequest {

    @XmlElement(name = "UUIDFactura", required = true)
    protected String uuidFactura;
    @XmlElement(name = "Orden", required = true)
    protected GenerarFolioRequest.Orden orden;

    /**
     * Obtiene el valor de la propiedad uuidFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUIDFactura() {
        return uuidFactura;
    }

    /**
     * Define el valor de la propiedad uuidFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUIDFactura(String value) {
        this.uuidFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link GenerarFolioRequest.Orden }
     *     
     */
    public GenerarFolioRequest.Orden getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerarFolioRequest.Orden }
     *     
     */
    public void setOrden(GenerarFolioRequest.Orden value) {
        this.orden = value;
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
     *         &lt;element name="PrecioTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NumOrden" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FechaCompra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="InformacionComprador"&gt;
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
     *         &lt;element name="InformacionVendedor"&gt;
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
        "productos",
        "precioTotal",
        "numOrden",
        "fechaCompra",
        "informacionComprador",
        "informacionVendedor"
    })
    public static class Orden {

        @XmlElement(name = "Productos", required = true)
        protected GenerarFolioRequest.Orden.Productos productos;
        @XmlElement(name = "PrecioTotal", required = true)
        protected String precioTotal;
        @XmlElement(name = "NumOrden", required = true)
        protected String numOrden;
        @XmlElement(name = "FechaCompra", required = true)
        protected String fechaCompra;
        @XmlElement(name = "InformacionComprador", required = true)
        protected GenerarFolioRequest.Orden.InformacionComprador informacionComprador;
        @XmlElement(name = "InformacionVendedor", required = true)
        protected GenerarFolioRequest.Orden.InformacionVendedor informacionVendedor;

        /**
         * Obtiene el valor de la propiedad productos.
         * 
         * @return
         *     possible object is
         *     {@link GenerarFolioRequest.Orden.Productos }
         *     
         */
        public GenerarFolioRequest.Orden.Productos getProductos() {
            return productos;
        }

        /**
         * Define el valor de la propiedad productos.
         * 
         * @param value
         *     allowed object is
         *     {@link GenerarFolioRequest.Orden.Productos }
         *     
         */
        public void setProductos(GenerarFolioRequest.Orden.Productos value) {
            this.productos = value;
        }

        /**
         * Obtiene el valor de la propiedad precioTotal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrecioTotal() {
            return precioTotal;
        }

        /**
         * Define el valor de la propiedad precioTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrecioTotal(String value) {
            this.precioTotal = value;
        }

        /**
         * Obtiene el valor de la propiedad numOrden.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumOrden() {
            return numOrden;
        }

        /**
         * Define el valor de la propiedad numOrden.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumOrden(String value) {
            this.numOrden = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaCompra.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaCompra() {
            return fechaCompra;
        }

        /**
         * Define el valor de la propiedad fechaCompra.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaCompra(String value) {
            this.fechaCompra = value;
        }

        /**
         * Obtiene el valor de la propiedad informacionComprador.
         * 
         * @return
         *     possible object is
         *     {@link GenerarFolioRequest.Orden.InformacionComprador }
         *     
         */
        public GenerarFolioRequest.Orden.InformacionComprador getInformacionComprador() {
            return informacionComprador;
        }

        /**
         * Define el valor de la propiedad informacionComprador.
         * 
         * @param value
         *     allowed object is
         *     {@link GenerarFolioRequest.Orden.InformacionComprador }
         *     
         */
        public void setInformacionComprador(GenerarFolioRequest.Orden.InformacionComprador value) {
            this.informacionComprador = value;
        }

        /**
         * Obtiene el valor de la propiedad informacionVendedor.
         * 
         * @return
         *     possible object is
         *     {@link GenerarFolioRequest.Orden.InformacionVendedor }
         *     
         */
        public GenerarFolioRequest.Orden.InformacionVendedor getInformacionVendedor() {
            return informacionVendedor;
        }

        /**
         * Define el valor de la propiedad informacionVendedor.
         * 
         * @param value
         *     allowed object is
         *     {@link GenerarFolioRequest.Orden.InformacionVendedor }
         *     
         */
        public void setInformacionVendedor(GenerarFolioRequest.Orden.InformacionVendedor value) {
            this.informacionVendedor = value;
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
        public static class InformacionComprador {

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
        public static class InformacionVendedor {

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
            protected List<GenerarFolioRequest.Orden.Productos.Producto> producto;

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
             * {@link GenerarFolioRequest.Orden.Productos.Producto }
             * 
             * 
             */
            public List<GenerarFolioRequest.Orden.Productos.Producto> getProducto() {
                if (producto == null) {
                    producto = new ArrayList<GenerarFolioRequest.Orden.Productos.Producto>();
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

}
