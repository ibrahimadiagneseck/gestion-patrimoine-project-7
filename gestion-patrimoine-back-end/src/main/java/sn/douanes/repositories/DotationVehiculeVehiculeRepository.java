package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.DotationVehiculeVehicule;
import sn.douanes.entities.Vehicule;
import sn.douanes.entities.keys.DotationVehiculeVehiculeId;

@Repository
public interface DotationVehiculeVehiculeRepository extends JpaRepository<DotationVehiculeVehicule, DotationVehiculeVehiculeId> {

    DotationVehiculeVehicule findByNumeroSerie(Vehicule numeroSerie);
}
