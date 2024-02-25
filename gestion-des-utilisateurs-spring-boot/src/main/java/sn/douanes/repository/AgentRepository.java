package sn.douanes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, String> {
    Agent findByMatriculeAgent(String matriculeAgent);
    Agent findByEmailAgent(String emailAgent);
}
