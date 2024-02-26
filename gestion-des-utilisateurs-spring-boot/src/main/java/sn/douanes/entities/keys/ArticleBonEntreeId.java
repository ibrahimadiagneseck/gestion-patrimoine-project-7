package sn.douanes.entities.keys;

import sn.douanes.entities.BonEntree;

import java.io.Serializable;

public class ArticleBonEntreeId implements Serializable {

    private String codeArticleBonEntree;
    private BonEntree identifiantBE;

    public ArticleBonEntreeId() {
    }

    public ArticleBonEntreeId(String codeArticleBonEntree, BonEntree identifiantBE) {
        this.codeArticleBonEntree = codeArticleBonEntree;
        this.identifiantBE = identifiantBE;
    }
}
