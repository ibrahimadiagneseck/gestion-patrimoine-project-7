package sn.douanes.entities.keys;

import sn.douanes.entities.DotationVehicule;
import sn.douanes.entities.Vehicule;

import java.io.Serializable;

public class DotationVehiculeVehiculeId implements Serializable {

    private Vehicule numeroSerie;
    private DotationVehicule identifiantDV;


    public DotationVehiculeVehiculeId() {
    }

    public DotationVehiculeVehiculeId(Vehicule numeroSerie, DotationVehicule identifiantDV) {
        this.numeroSerie = numeroSerie;
        this.identifiantDV = identifiantDV;
    }
}
