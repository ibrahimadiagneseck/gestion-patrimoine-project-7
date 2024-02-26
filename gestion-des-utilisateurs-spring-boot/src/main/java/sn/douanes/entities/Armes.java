package sn.douanes.entities;


//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "armes")
public class Armes {

    @Id
    @Column(name = "identifiant_armes")
    private Long id;

}