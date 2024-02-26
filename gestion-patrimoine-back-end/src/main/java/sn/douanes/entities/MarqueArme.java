package sn.douanes.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "marque_arme")
public class MarqueArme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "code_marque_arme", nullable = false, updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String codeMarqueArme;


    @Column(name = "libelle_marque")
    private String libelleMarque;

    public MarqueArme() {
    }

    public MarqueArme(String codeMarqueArme, String libelleMarque) {
        this.codeMarqueArme = codeMarqueArme;
        this.libelleMarque = libelleMarque;
    }

    public String getCodeMarqueArme() {
        return codeMarqueArme;
    }

    public void setCodeMarqueArme(String codeMarqueArme) {
        this.codeMarqueArme = codeMarqueArme;
    }

    public String getLibelleMarque() {
        return libelleMarque;
    }

    public void setLibelleMarque(String libelleMarque) {
        this.libelleMarque = libelleMarque;
    }

    @Override
    public String toString() {
        return "MarqueArme{" +
                "codeMarqueArme='" + codeMarqueArme + '\'' +
                ", libelleMarque='" + libelleMarque + '\'' +
                '}';
    }
}