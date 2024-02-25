package sn.douanes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "secteur_activite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SecteurActivite {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "code_section", nullable = false, updatable = false)
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "code_secteur_activite", length = 10)
    private String codeSecteurActivite;


    @Column(name = "libelle_secteur_activite")
    private String libelleSecteurActivite;


//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "secteurActivite")
//    private Set<Prestataires> prestataires = new HashSet<>();



}
