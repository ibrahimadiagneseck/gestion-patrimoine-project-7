package sn.douanes.services;


import sn.douanes.entities.Agent;
import sn.douanes.entities.BonPour;
import sn.douanes.entities.Sections;
import sn.douanes.entities.UniteDouaniere;

import java.sql.Date;
import java.util.List;

public interface BonPourService {

    BonPour saveBonPour(BonPour b);
    BonPour updateBonPour(BonPour b);
    void deleteBonPour(BonPour b);
    void deleteBonPourById(String id);
    BonPour getBonPourById(String id);
    List<BonPour> getAllBonPours();

    BonPour ajouterBonPour(String descriptionBP, Integer numeroCourrielOrigine, Date dateCourrielOrigine, String etatBP, String objectCourrielOrigine, Integer numeroArriveDLF, Date dateArriveDLF, String observationDLF, Integer numeroArriveBLM, Date dateArriveBLM, String observationBLM, Integer numeroArriveSection, Date dateArriveSection, String observationSection, UniteDouaniere codeUniteDouaniere, Sections codeSection, Agent matriculeAgent);


}
