package sn.douanes.gestionPatrimoineVehiculeSpringBoot.services;

import sn.douanes.gestionPatrimoineVehiculeSpringBoot.entities.Fournisseurs;

import java.util.List;

public interface FournisseursService {

    Fournisseurs saveFournisseurs(Fournisseurs f);
    Fournisseurs updateFournisseurs(Fournisseurs f);
    void deleteFournisseurs(Fournisseurs f);
    void deleteFournisseursById(String id);
    Fournisseurs getFournisseurs(String id);
    List<Fournisseurs> getAllFournisseurs();


}
