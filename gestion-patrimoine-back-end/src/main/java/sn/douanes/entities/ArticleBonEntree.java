package sn.douanes.entities;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
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

import sn.douanes.entities.keys.ArticleBonEntreeId;

import java.sql.Timestamp;


@Entity
@IdClass(ArticleBonEntreeId.class)
@Table(name = "article_bon_entree")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleBonEntree {

    @Id
    @Column(name = "code_article_bon_entree", length = 25)
    private String codeArticleBonEntree;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identifiant_b_e")
    private BonEntree identifiantBE;

    @Column(name = "libelle_article_bon_entree")
    private String libelleArticleBonEntree;

    @Column(name = "quantite_entree")
    private Integer quantiteEntree;

    @Column(name = "date_enregistrement")
    private Timestamp dateEnregistrement;

    @ManyToOne
    @JoinColumn(name = "code_type_objet")
    private TypeObjet codeTypeObjet;

    @ManyToOne
    @JoinColumn(name = "code_lieu_vh")
    private LieuStockageVehicule codeLieuVH;

    @ManyToOne
    @JoinColumn(name = "matricule_agent")
    private Agent matriculeAgent;



}