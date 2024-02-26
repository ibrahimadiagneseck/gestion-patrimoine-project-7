package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "unite_hierarchique")
public class UniteHierarchique {

    @Id
    @Column(name = "code_unite_hierarchique")
    private String codeUniteHierarchique;


    @Column(name = "libelle_unite_hierarchique")
    private String libelleUniteHierarchique;

    @Column(name = "sigle_unite_hierarchique")
    private String sigleUniteHierarchique;

}