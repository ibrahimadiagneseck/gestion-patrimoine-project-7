package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.Materiels;


@Repository
public interface MaterielsRepository extends JpaRepository<Materiels, String> {
}
