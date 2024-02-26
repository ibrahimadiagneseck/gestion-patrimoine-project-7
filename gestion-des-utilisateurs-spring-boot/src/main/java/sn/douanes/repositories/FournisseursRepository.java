package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.Fournisseurs;

@Repository
public interface FournisseursRepository extends JpaRepository<Fournisseurs, String> {

}
