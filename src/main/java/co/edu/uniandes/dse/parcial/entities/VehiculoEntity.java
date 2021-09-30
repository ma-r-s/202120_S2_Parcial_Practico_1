package co.edu.uniandes.dse.parcial.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class VehiculoEntity extends BaseEntity {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private String municipio;
}
