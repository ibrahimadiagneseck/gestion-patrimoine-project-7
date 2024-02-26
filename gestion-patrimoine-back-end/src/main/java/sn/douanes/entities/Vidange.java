package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "vidange")
public class Vidange {

    @Id
    @Column(name = "numero_immatriculation")
    private String numeroImmatriculation;

}