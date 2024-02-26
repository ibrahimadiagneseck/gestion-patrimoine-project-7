package sn.douanes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.entities.Agent;
import sn.douanes.entities.BordereauLivraison;
import sn.douanes.entities.Prestataires;
import sn.douanes.entities.Sections;
import sn.douanes.repositories.BordereauLivraisonRepository;
import sn.douanes.services.BordereauLivraisonService;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class BordereauLivraisonServiceImpl implements BordereauLivraisonService {

    @Autowired
    BordereauLivraisonRepository bordereauLivraisonRepository;

    @Override
    public BordereauLivraison saveBordereauLivraison(BordereauLivraison b) {
        return bordereauLivraisonRepository.save(b);
    }

    @Override
    public BordereauLivraison updateBordereauLivraison(BordereauLivraison b) {
        b.setDateEnregistrement(new Timestamp(System.currentTimeMillis()));
        // b.setIdentifiantBL(genererIdentifiantBE(b.getCodeSection().getCodeSection(), genererDateEnregistrement(b.getDateEnregistrement())));

        return bordereauLivraisonRepository.save(b);
    }

    @Override
    public void deleteBordereauLivraison(BordereauLivraison b) {
        bordereauLivraisonRepository.delete(b);
    }

    @Override
    public void deleteBordereauLivraisonById(String id) {
        bordereauLivraisonRepository.deleteById(id);
    }

    @Override
    public BordereauLivraison getBordereauLivraisonById(String id) {
        return bordereauLivraisonRepository.findById(id).isPresent() ? bordereauLivraisonRepository.findById(id).get() : null;
    }

    @Override
    public List<BordereauLivraison> getAllBordereauLivraisons() {
        return bordereauLivraisonRepository.findAll();
    }

    @Override
    public BordereauLivraison ajouterBordereauLivraison(
            String numeroBL,
            String descriptionBL,
            String lieuDeLivraison,
            Date dateBL,
            String conformiteBL,
            String representantPrestataire,
            Sections codeSection,
            Prestataires ninea,
            Agent matriculeAgent
    ) {

        BordereauLivraison bordereauLivraison = new BordereauLivraison();

        bordereauLivraison.setDateEnregistrement(new Timestamp(System.currentTimeMillis()));
        bordereauLivraison.setIdentifiantBL(genererIdentifiantBE(codeSection.getCodeSection(), genererDateEnregistrement(bordereauLivraison.getDateEnregistrement())));

        bordereauLivraison.setNumeroBL(numeroBL);
        bordereauLivraison.setDescriptionBL(descriptionBL);
        bordereauLivraison.setLieuDeLivraison(lieuDeLivraison);
        bordereauLivraison.setDateBL(dateBL);
        bordereauLivraison.setConformiteBL(conformiteBL);
        bordereauLivraison.setRepresentantPrestataire(representantPrestataire);
        bordereauLivraison.setCodeSection(codeSection);
        bordereauLivraison.setNinea(ninea);
        bordereauLivraison.setMatriculeAgent(matriculeAgent);

        return bordereauLivraisonRepository.save(bordereauLivraison);
    }


    private String genererIdentifiantBE(String codeSection, String dateEnregistrement) {
        // Timestamp t = new Timestamp(System.currentTimeMillis());
         return "BL" + codeSection + dateEnregistrement;
    }

    private String genererDateEnregistrement(Timestamp dateEnregistrement) {
        // Timestamp t = new Timestamp(System.currentTimeMillis());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        return dateEnregistrement.toLocalDateTime().format(formatter);
    }

    @Override
    public List<BordereauLivraison> getAllBordereauByNinea(Prestataires ninea) {
        return bordereauLivraisonRepository.findAllByNinea(ninea);
    }

}
