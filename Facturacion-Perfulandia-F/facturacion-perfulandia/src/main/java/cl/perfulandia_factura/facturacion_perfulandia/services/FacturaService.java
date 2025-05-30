package cl.perfulandia_factura.facturacion_perfulandia.services;

import cl.perfulandia_factura.facturacion_perfulandia.model.Factura;
import cl.perfulandia_factura.facturacion_perfulandia.model.VentaDTO;
import cl.perfulandia_factura.facturacion_perfulandia.repository.FacturaRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;


    public Factura generarFactura(@NotNull Factura factura) {
        return facturaRepository.save(factura);
    }

    public List<Factura> obtenerTodas() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> obtenerPorId(String id) {
        return facturaRepository.findById(Long.valueOf(id));
    }

    public Factura obtenerPorVenta(String idVenta) {
        return facturaRepository.findByIdVenta(idVenta);
    }


}
