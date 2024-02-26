package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.UniteHierarchique;

@Repository
public interface UniteHierarchiqueRepository extends JpaRepository<UniteHierarchique, String> {
}
