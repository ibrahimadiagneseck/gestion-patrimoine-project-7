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
import java.sql.Timestamp;


@Entity
@Table(name = "bordereau_livraison")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BordereauLivraison {

    @Id
    @Column(name = "identifiant_b_l", length = 25)
    private String identifiantBL;

    @Column(name = "numero_b_l", length = 100, unique = true)
    private String numeroBL;

    @Column(name = "description_b_l", length = 512)
    private String descriptionBL;

    @Column(name = "lieu_de_livraison")
    private String lieuDeLivraison;

    @Column(name = "date_b_l")
    private Date dateBL;

    @Column(name = "conformite_b_l", length = 3)
    private String conformiteBL;


    @Column(name = "representant_prestataire")
    private String representantPrestataire;


    @ManyToOne
    @JoinColumn(name = "code_section")
    private Sections codeSection;


    @ManyToOne
    @JoinColumn(name = "ninea")
    private Prestataires ninea;

    @ManyToOne
    @JoinColumn(name = "matricule_agent")
    private Agent matriculeAgent;



    @Column(name = "date_enregistrement")
    private Timestamp dateEnregistrement;

}