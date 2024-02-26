package sn.douanes.services;


import sn.douanes.entities.Agent;
import sn.douanes.entities.ArticleBonSortie;
import sn.douanes.entities.DotationVehicule;
import sn.douanes.entities.Vehicule;

import java.util.List;
import java.util.Set;

public interface DotationVehiculeService {

    DotationVehicule saveDotationVehicule(DotationVehicule d);
    DotationVehicule updateDotationVehicule(DotationVehicule d);
    void deleteDotationVehicule(DotationVehicule d);
    void deleteDotationVehiculeById(String id);
    DotationVehicule getDotationVehiculeById(String id);
    List<DotationVehicule> getAllDotationVehicules();

    DotationVehicule ajouterDotationVehicule(ArticleBonSortie identifiantBS, Agent matriculeAgent, Set<Vehicule> vehiculeDotation);




}
