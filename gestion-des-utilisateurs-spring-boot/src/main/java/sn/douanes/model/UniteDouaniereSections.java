package sn.douanes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.douanes.model.keys.UniteDouaniereSectionsId;


@Entity
@IdClass(UniteDouaniereSectionsId.class)
@Table(name = "unite_douaniere_sections")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
