package mx.uv.compras.Modelo;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroOrdenCompra;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nombre", column = @Column(name = "nombre_comprador")),
        @AttributeOverride(name = "direccion", column = @Column(name = "direccion_comprador"))
    })
    private DatosComprador datosComprador;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Producto> productos;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "nombre", column = @Column(name = "nombre_vendedor")),
        @AttributeOverride(name = "direccion", column = @Column(name = "direccion_vendedor"))
    })
    private DatosVendedor datosVendedor;

    private BigDecimal precioTotal;
    private LocalDate fechaCompra;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroOrdenCompra() {
        return numeroOrdenCompra;
    }

    public void setNumeroOrdenCompra(String numeroOrdenCompra) {
        this.numeroOrdenCompra = numeroOrdenCompra;
    }

    public DatosComprador getDatosComprador() {
        return datosComprador;
    }

    public void setDatosComprador(DatosComprador datosComprador) {
        this.datosComprador = datosComprador;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public DatosVendedor getDatosVendedor() {
        return datosVendedor;
    }

    public void setDatosVendedor(DatosVendedor datosVendedor) {
        this.datosVendedor = datosVendedor;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Embeddable
    public static class Producto {
        private String nombre;
        private int cantidad;
        private BigDecimal precioUnitario;

        // Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public BigDecimal getPrecioUnitario() {
            return precioUnitario;
        }

        public void setPrecioUnitario(BigDecimal precioUnitario) {
            this.precioUnitario = precioUnitario;
        }
    }

    @Embeddable
    public static class DatosVendedor {
        private String nombre;
        private String direccion;

        // Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

    @Embeddable
    public static class DatosComprador {
        private String nombre;
        private String direccion;

        // Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }
}
