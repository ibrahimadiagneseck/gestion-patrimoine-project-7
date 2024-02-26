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

import sn.douanes.entities.keys.UniteDouaniereSectionsId;


@Entity
@IdClass(UniteDouaniereSectionsId.class)
@Table(name = "unite_douaniere_sections")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniteDouaniereSections {

    @Id
    @ManyToOne
    @JoinColumn(name = "code_unite_douaniere")
    private UniteDouaniere codeUniteDouaniere;

    @Id
    @ManyToOne
    @JoinColumn(name = "code_section")
    private Sections codeSection;

}
