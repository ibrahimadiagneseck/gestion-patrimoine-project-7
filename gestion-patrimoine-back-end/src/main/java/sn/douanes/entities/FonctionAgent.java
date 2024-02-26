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
@Table(name = "fonction_agent")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FonctionAgent {

    @Id
    @Column(name = "code_fonction_agent", length = 10)
    private String codeFonctionAgent;

    @Column(name = "libelle_fonction_agent", length = 100)
    private String libelleFonctionAgent;

}