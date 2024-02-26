package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "etat_vehicule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtatVehicule {

    @Id
    @Column(name = "code_etat", length = 10)
    private String codeEtat;

    @Column(name = "libelle_etat", length = 10)
    private String libelleEtat;

}