package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "secteur_activite")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecteurActivite {

    @Id
    @Column(name = "code_secteur_activite", length = 10)
    private String codeSecteurActivite;


    @Column(name = "libelle_secteur_activite")
    private String libelleSecteurActivite;



}
