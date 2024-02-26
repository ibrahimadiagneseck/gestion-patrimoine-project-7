package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @Column(name = "identifiant_maintenance")
    private Long id;

}