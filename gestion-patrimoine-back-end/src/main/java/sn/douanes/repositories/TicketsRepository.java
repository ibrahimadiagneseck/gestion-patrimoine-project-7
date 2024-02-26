package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.Tickets;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
}
