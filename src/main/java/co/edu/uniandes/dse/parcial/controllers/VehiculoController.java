package co.edu.uniandes.dse.parcial.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniandes.dse.parcial.dto.VehiculoDTO;
import co.edu.uniandes.dse.parcial.entities.VehiculoEntity;
import co.edu.uniandes.dse.parcial.services.VehiculoService;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<VehiculoDTO> findAll() {
        List<VehiculoEntity> vehiculos = vehiculoService.getVehiculos();
        return modelMapper.map(vehiculos, new TypeToken<List<VehiculoDTO>>() {
        }.getType());
    }
}
