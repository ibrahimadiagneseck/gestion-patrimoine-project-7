package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "changement_piece")
public class ChangementPiece {

    @Id
    @Column(name = "identifiant_changement_piece")
    private Long id;

}