package sn.douanes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.entities.Agent;
import sn.douanes.entities.ArticleBonSortie;
import sn.douanes.entities.BonDeSortie;
import sn.douanes.entities.keys.ArticleBonSortieId;
import sn.douanes.repositories.ArticleBonSortieRepository;
import sn.douanes.services.ArticleBonSortieService;

import java.sql.Date;
import java.util.List;


@Service
public class ArticleBonSortieServiceImpl implements ArticleBonSortieService {

    @Autowired
    ArticleBonSortieRepository articleBonSortieRepository;

    @Override
    public ArticleBonSortie saveArticleBonSortie(ArticleBonSortie a) {
        return articleBonSortieRepository.save(a);
    }

    @Override
    public ArticleBonSortie updateArticleBonSortie(ArticleBonSortie a) {
        return articleBonSortieRepository.save(a);
    }

    @Override
    public void deleteArticleBonSortie(ArticleBonSortie a) {
        articleBonSortieRepository.delete(a);
    }

    @Override
    public void deleteArticleBonSortieById(String codeArticleBonSortie, BonDeSortie identifiantBS) {
        articleBonSortieRepository.deleteById(new ArticleBonSortieId(codeArticleBonSortie, identifiantBS));
    }

    @Override
    public ArticleBonSortie getArticleBonSortieById(String codeArticleBonSortie, BonDeSortie identifiantBS) {
        return articleBonSortieRepository.findById(new ArticleBonSortieId(codeArticleBonSortie, identifiantBS)).isPresent() ? articleBonSortieRepository.findById(new ArticleBonSortieId(codeArticleBonSortie, identifiantBS)).get() : null;
    }


    @Override
    public List<ArticleBonSortie> getAllArticleBonSorties() {
        return articleBonSortieRepository.findAll();
    }


    @Override
    public ArticleBonSortie ajouterArticleBonSortie(
            BonDeSortie identifiantBS,
            String codeArticleBonSortie,
            String libelleArticleBonSortie,
            Integer quantiteAccordee,
            Agent matriculeAgent
    ) {

        ArticleBonSortie articleBonSortie = new ArticleBonSortie();

        articleBonSortie.setIdentifiantBS(identifiantBS);
        articleBonSortie.setCodeArticleBonSortie(codeArticleBonSortie);
        articleBonSortie.setLibelleArticleBonSortie(libelleArticleBonSortie);
        articleBonSortie.setQuantiteAccordee(quantiteAccordee);
        articleBonSortie.setDateArticleBonSortie(new Date(System.currentTimeMillis()));

        articleBonSortie.setMatriculeAgent(matriculeAgent);

        return articleBonSortieRepository.save(articleBonSortie);
    }




}
