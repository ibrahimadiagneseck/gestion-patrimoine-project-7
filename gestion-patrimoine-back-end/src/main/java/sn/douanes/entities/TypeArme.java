package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "type_arme")
public class TypeArme {

    @Id
    @Column(name = "code_type_arme")
    private String codeTypeArme;


    @Column(name = "libelle_type_arme")
    private String libelleTypeArme;

}