package sn.douanes.gestionPatrimoineVehiculeSpringBoot.services;

import sn.douanes.gestionPatrimoineVehiculeSpringBoot.entities.TypeArme;

import java.util.List;

public interface TypeArmeService {

    TypeArme saveTypeArme(TypeArme t);
    TypeArme updateTypeArme(TypeArme t);
    void deleteTypeArme(TypeArme t);
    void deleteTypeArmeById(String id);
    TypeArme getTypeArme(String id);
    List<TypeArme> getAllTypeArmes();


}
