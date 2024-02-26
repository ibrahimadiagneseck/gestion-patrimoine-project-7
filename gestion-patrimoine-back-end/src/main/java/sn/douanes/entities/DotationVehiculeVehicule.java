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

import sn.douanes.entities.keys.DotationVehiculeVehiculeId;

@Entity
@IdClass(DotationVehiculeVehiculeId.class)
@Table(name = "dotation_vehicule_vehicule")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class DotationVehiculeVehicule {

    @Id
    @ManyToOne
    @JoinColumn(name = "numero_serie")
    private Vehicule numeroSerie;

    @Id
    @ManyToOne
    @JoinColumn(name = "identifiant_d_v")
    private DotationVehicule identifiantDV;

}
