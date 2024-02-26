package sn.douanes.entities;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.IdClass;
//import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import sn.douanes.entities.keys.PrestatairesSecteurId;


@Entity
@IdClass(PrestatairesSecteurId.class)
@Table(name = "prestataires_secteur")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrestatairesSecteur {


    @Id
    @ManyToOne
    @JoinColumn(name = "ninea")
    private Prestataires ninea;

    @Id
    @ManyToOne
    @JoinColumn(name = "code_secteur_activite")
    private SecteurActivite codeSecteurActivite;

}
