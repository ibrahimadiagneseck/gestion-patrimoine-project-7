package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.UniteDouaniereSections;
import sn.douanes.entities.keys.UniteDouaniereSectionsId;


@Repository
public interface UniteDouaniereSectionsRepository extends JpaRepository<UniteDouaniereSections, UniteDouaniereSectionsId> {

}
