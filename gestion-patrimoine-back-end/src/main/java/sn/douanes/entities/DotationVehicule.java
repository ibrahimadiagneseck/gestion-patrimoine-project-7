package sn.douanes.entities;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.ManyToOne;
//import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
//import javax.persistence.FetchType;
//import javax.persistence.JoinTable;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dotation_vehicule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DotationVehicule {


    @Id
    @Column(name = "identifiant_d_v", length = 25)
    private String identifiantDV;


    @Column(name = "date_dotation")
    private Date dateDotation;



    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "identifiant_b_s", referencedColumnName = "identifiant_b_s"),
            @JoinColumn(name = "code_article_bon_sortie", referencedColumnName = "code_article_bon_sortie")
    })
    private ArticleBonSortie identifiantBS;



    @ManyToOne
    @JoinColumn(name = "matricule_agent")
    private Agent matriculeAgent;



    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "dotation_vehicule_vehicule",
            joinColumns = @JoinColumn(name = "identifiant_d_v"),
            inverseJoinColumns = @JoinColumn(name = "numero_serie")
    )
    private Set<Vehicule> vehiculeDotation = new HashSet<>();



}