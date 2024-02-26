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

import java.sql.Date;


@Entity
@Table(name = "bon_de_sortie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BonDeSortie {

    @Id
    @Column(name = "identifiant_b_s", length = 25)
    private String identifiantBS;

    @Column(name = "numero_b_s", length = 100)
    private String numeroBS;

    @Column(name = "description_b_s")
    private String descriptionBS;

    @Column(name = "date_b_s")
    private Date dateBS;

    @ManyToOne
    @JoinColumn(name = "identifiant_b_p")
    private BonPour identifiantBP;


    @ManyToOne
    @JoinColumn(name = "matricule_agent")
    private Agent matriculeAgent;

}