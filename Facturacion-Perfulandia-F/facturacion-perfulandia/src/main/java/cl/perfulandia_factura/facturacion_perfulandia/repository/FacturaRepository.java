package cl.perfulandia_factura.facturacion_perfulandia.repository;

import cl.perfulandia_factura.facturacion_perfulandia.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    Factura findByIdVenta(String idVenta);

}

