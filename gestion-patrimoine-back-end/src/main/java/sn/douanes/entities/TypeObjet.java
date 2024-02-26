package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "type_objet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeObjet {

    @Id
    @Column(name = "code_type_objet", length = 5)
    private String codeTypeObjet;

    @Column(name = "libelle_type_objet", length = 100)
    private String libelleTypeObjet;

    @ManyToOne
    @JoinColumn(name = "code_section")
    private Sections codeSection;

}