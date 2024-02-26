package sn.douanes.entities;


//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "carburant")
public class Carburant {

    @Id
    @Column(name = "identifiant_carburant")
    private Long id;

}