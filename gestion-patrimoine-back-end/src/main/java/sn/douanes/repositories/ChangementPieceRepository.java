package sn.douanes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.douanes.entities.ChangementPiece;

@Repository
public interface ChangementPieceRepository extends JpaRepository<ChangementPiece, String> {
}
