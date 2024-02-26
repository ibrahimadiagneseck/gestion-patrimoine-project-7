package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.BonDeSortie;


@Repository
public interface BonDeSortieRepository extends JpaRepository<BonDeSortie, String> {

}
