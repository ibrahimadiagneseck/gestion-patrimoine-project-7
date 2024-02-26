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
@Table(name = "type_vehicule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeVehicule {

    @Id
    @Column(name = "code_type_vehicule", length = 20)
    private String codeTypeVehicule;

    @Column(name = "libelle_type_vehicule", length = 20)
    private String libelleTypeVehicule;

}