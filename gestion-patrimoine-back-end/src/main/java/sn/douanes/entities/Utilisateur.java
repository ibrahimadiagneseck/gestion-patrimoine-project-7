package sn.douanes.entities;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.FetchType;
//import javax.persistence.JoinTable;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

import jakarta.persistence.*;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "utilisateur_id", nullable = false, updatable = false)
    private Long utilisateurId;

    @Column(name = "user_name", length = 7)
    private String userName; // userName -> matricule

    private Date lastLoginDate;
    private Date lastLoginDateDisplay;

    private boolean isActive;
    private boolean isNotLocked;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String pwd;

    private String role;

    private Date joinDate;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(
            name = "utilisateur_authority",
            joinColumns = @JoinColumn(name = "utilisateur_id"),
            inverseJoinColumns = @JoinColumn(name = "code")
    )
    private Set<Authority> authorities = new HashSet<>();



    @OneToOne
    @JoinColumn(name = "matricule_agent")
    private Agent matriculeAgent;


    public boolean getActive() {
        return this.isActive;
    }

    public boolean getNotLocked() {
        return this.isNotLocked;
    }


}
