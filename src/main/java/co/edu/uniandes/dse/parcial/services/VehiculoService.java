package co.edu.uniandes.dse.parcial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcial.entities.VehiculoEntity;
import co.edu.uniandes.dse.parcial.repositories.VehiculoRepository;

@Service
public class VehiculoService {
    // Obtener Colegios

    @Autowired
    VehiculoRepository vehiculoRepository;

    @Transactional
    public List<VehiculoEntity> getVehiculos() {
        return vehiculoRepository.findAll();
    }
}
