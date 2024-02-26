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

import sn.douanes.entities.keys.UtilisateurAuthorityId;

@Entity
@IdClass(UtilisateurAuthorityId.class)
@Table(name = "utilisateur_authority")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurAuthority {

    @Id
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateurId;

    @Id
    @ManyToOne
    @JoinColumn(name = "code")
    private Authority code;
}
