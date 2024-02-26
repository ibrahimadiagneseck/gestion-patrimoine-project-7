package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "controle")
public class Controle {

    @Id
    @Column(name = "numero_immatriculation")
    private String numeroImmatriculation;


    @Column(name = "date_controle")
    private Date dateControle;

    @Column(name = "observation_controle")
    private String observationControle;


}