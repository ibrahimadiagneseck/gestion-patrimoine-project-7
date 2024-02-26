package sn.douanes.entities.keys;


import sn.douanes.entities.Sections;
import sn.douanes.entities.UniteDouaniere;

import java.io.Serializable;

public class UniteDouaniereSectionsId implements Serializable {

    private UniteDouaniere codeUniteDouaniere;
    private Sections codeSection;

    public UniteDouaniereSectionsId() {
    }

    public UniteDouaniereSectionsId(UniteDouaniere codeUniteDouaniere, Sections codeSection) {
        this.codeUniteDouaniere = codeUniteDouaniere;
        this.codeSection = codeSection;
    }

}
