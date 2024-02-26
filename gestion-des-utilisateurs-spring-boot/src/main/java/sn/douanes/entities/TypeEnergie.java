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
@Table(name = "type_energie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeEnergie {

    @Id
    @Column(name = "code_type_energie", length = 25)
    private String codeTypeEnergie;

    @Column(name = "libelle_type_energie", length = 100)
    private String libelleTypeEnergie;

}