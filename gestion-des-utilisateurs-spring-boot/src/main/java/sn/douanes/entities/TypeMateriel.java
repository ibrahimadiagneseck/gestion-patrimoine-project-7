package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "type_materiel")
public class TypeMateriel {

    @Id
    @Column(name = "code_type_materiel")
    private String codeTypeMateriel;


    @Column(name = "libelle_type_materiel")
    private String libelle_type_materiel;

}