package sn.douanes.entities;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.FetchType;
//import javax.persistence.JoinTable;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "unite_douaniere")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniteDouaniere {

    @Id
    @Column(name = "code_unite_douaniere", length = 3)
    private String codeUniteDouaniere;


    @Column(name = "nom_unite_douaniere")
    private String nomUniteDouaniere;

    @Column(name = "effectif_unite_douaniere")
    private Integer effectifUniteDouaniere;

    @Column(name = "nombre_arme")
    private Integer nombreArme;

    @Column(name = "nombre_automobile")
    private Integer nombreAutomobile;

    @Column(name = "nombre_materiel")
    private Integer nombreMateriel;


    @ManyToOne
    @JoinColumn(name = "code_type_unite_douaniere")
    private TypeUniteDouaniere codeTypeUniteDouaniere;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "unite_douaniere_sections",
            joinColumns = @JoinColumn(name = "code_unite_douaniere"),
            inverseJoinColumns = @JoinColumn(name = "code_section")
    )
    private Set<Sections> sections = new HashSet<>();

}