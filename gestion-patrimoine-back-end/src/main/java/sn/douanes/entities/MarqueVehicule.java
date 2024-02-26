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
@Table(name = "marque_vehicule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarqueVehicule {

    @Id
    @Column(name = "code_marque", length = 25)
    private String codeMarque;

    @Column(name = "libelle_marque", length = 100)
    private String libelleMarque;

}