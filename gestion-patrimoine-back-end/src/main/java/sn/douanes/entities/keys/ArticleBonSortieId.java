package sn.douanes.entities.keys;

import sn.douanes.entities.BonDeSortie;

import java.io.Serializable;

public class ArticleBonSortieId implements Serializable {

    private String codeArticleBonSortie;
    private BonDeSortie identifiantBS;

    public ArticleBonSortieId() {
    }

    public ArticleBonSortieId(String codeArticleBonSortie, BonDeSortie identifiantBS) {
        this.codeArticleBonSortie = codeArticleBonSortie;
        this.identifiantBS = identifiantBS;
    }
}
