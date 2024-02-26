package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "type_unite_douaniere")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeUniteDouaniere {

    @Id
    @Column(name = "code_type_unite_douaniere", length = 5)
    private String codeTypeUniteDouaniere;


    @Column(name = "libelle_type_unite_douaniere", length = 100)
    private String libelleTypeUniteDouaniere;

}
