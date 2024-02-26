package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "materiels")
public class Materiels {

    @Id
    @Column(name = "identifiant_materiels")
    private Long id;

}