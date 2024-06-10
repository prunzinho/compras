package mx.uv.compras.ORM;

import org.springframework.data.repository.CrudRepository;
import mx.uv.compras.Modelo.Compras;

public interface ICompras extends CrudRepository<Compras, Long> {
    Compras findByNumeroOrdenCompra(String numeroOrdenCompra);
}