package sn.douanes.entities.keys;


import sn.douanes.entities.Authority;
import sn.douanes.entities.Utilisateur;

import java.io.Serializable;


public class UtilisateurAuthorityId implements Serializable {

    private Utilisateur utilisateurId;
    private Authority code;


    public UtilisateurAuthorityId() {
    }
    public UtilisateurAuthorityId(Utilisateur utilisateurId, Authority code) {
        this.utilisateurId = utilisateurId;
        this.code = code;
    }

}
