package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.Authority;


@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {

}