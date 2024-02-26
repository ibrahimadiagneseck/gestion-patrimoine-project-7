package sn.douanes.entities.keys;

import sn.douanes.entities.BonPour;

import java.io.Serializable;

public class ArticleBonPourId implements Serializable {

    private String codeArticleBonPour;
    private BonPour identifiantBP;

    public ArticleBonPourId() {
    }

    public ArticleBonPourId(String codeArticleBonPour, BonPour identifiantBP) {
        this.codeArticleBonPour = codeArticleBonPour;
        this.identifiantBP = identifiantBP;
    }
}
