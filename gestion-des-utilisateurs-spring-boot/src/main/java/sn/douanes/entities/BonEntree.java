package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Date;


@Entity
@Table(name = "bon_entree")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BonEntree {

    @Id
    @Column(name = "identifiant_b_e", length = 25)
    private String identifiantBE;

    @Column(name = "numero_b_e", length = 100, unique = true)
    private String numeroBE;

    @Column(name = "libelle_bon_entree")
    private String libelleBonEntree;

    @Column(name = "date_bon_entree")
    private Date dateBonEntree;

    @Column(name = "observation_bon_entree")
    private String observationBonEntree;


    @ManyToOne
    @JoinColumn(name = "identifiant_b_l")
    private BordereauLivraison identifiantBL;


}