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
@Table(name = "lieu_stockage_vehicule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LieuStockageVehicule {

    @Id
    @Column(name = "code_lieu_vh", length = 3)
    private String codeLieuVH;

    @Column(name = "libellle_lieu_vh", length = 100)
    private String libellleLieuVH;

    @Column(name = "nombre_limite_stockage_vh")
    private Integer nombreLimiteStockageVH;


}
