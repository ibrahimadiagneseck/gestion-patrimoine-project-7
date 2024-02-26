package sn.douanes.entities;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.FetchType;
//import javax.persistence.JoinTable;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "prestataires")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prestataires {

    @Id
    @Column(name = "ninea", length = 20)
    private String ninea;

    @Column(name = "raison_sociale", length = 512)
    private String raisonSociale;

    @Column(name = "numero_telephone")
    private Integer numeroTelephone;

    @Column(name = "adresse_email", length = 100)
    private String adresseEmail;

    @Column(name = "adresse", length = 512)
    private String adresse;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "prestataires_secteur",
            joinColumns = @JoinColumn(name = "ninea"),
            inverseJoinColumns = @JoinColumn(name = "code_secteur_activite")
    )
    private Set<SecteurActivite> secteurActivite = new HashSet<>();

}
