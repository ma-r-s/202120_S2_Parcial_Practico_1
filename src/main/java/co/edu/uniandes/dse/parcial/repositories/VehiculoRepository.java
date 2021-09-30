package co.edu.uniandes.dse.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.uniandes.dse.parcial.entities.VehiculoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<VehiculoEntity, Long> {

}
