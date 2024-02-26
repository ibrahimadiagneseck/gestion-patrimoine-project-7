package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.EtatVehicule;


@Repository
public interface EtatVehiculeRepository extends JpaRepository<EtatVehicule, String> {

}
