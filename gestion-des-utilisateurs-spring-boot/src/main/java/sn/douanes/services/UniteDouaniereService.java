package sn.douanes.services;

import sn.douanes.entities.TypeUniteDouaniere;
import sn.douanes.entities.UniteDouaniere;

import java.util.List;

public interface UniteDouaniereService {

    UniteDouaniere saveUniteDouaniere(UniteDouaniere u);
    UniteDouaniere updateUniteDouaniere(UniteDouaniere u);
    void deleteUniteDouaniere(UniteDouaniere u);
    void deleteUniteDouaniereById(String id);
    UniteDouaniere getUniteDouaniereById(String id);
    List<UniteDouaniere> getAllUniteDouanieres();


    UniteDouaniere ajouterUniteDouaniere(String codeUniteDouaniere, String nomUniteDouaniere, Integer effectifUniteDouaniere, Integer nombreArme, Integer nombreAutomobile, Integer nombreMateriel, TypeUniteDouaniere codeTypeUniteDouaniere);


}
