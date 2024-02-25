package sn.douanes.gestionPatrimoineVehiculeSpringBoot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.gestionPatrimoineVehiculeSpringBoot.entities.EtatVehicule;
import sn.douanes.gestionPatrimoineVehiculeSpringBoot.repositories.EtatVehiculeRepository;
import sn.douanes.gestionPatrimoineVehiculeSpringBoot.services.EtatVehiculeService;


import java.util.List;


@Service
public class EtatVehiculeServiceImpl implements EtatVehiculeService {

    @Autowired
    EtatVehiculeRepository etatVehiculeRepository;

    @Override
    public EtatVehicule saveEtatVehicule(EtatVehicule e) {
        return etatVehiculeRepository.save(e);
    }

    @Override
    public EtatVehicule updateEtatVehicule(EtatVehicule e) {
        return etatVehiculeRepository.save(e);
    }

    @Override
    public void deleteEtatVehicule(EtatVehicule e) {
        etatVehiculeRepository.delete(e);
    }

    @Override
    public void deleteEtatVehiculeById(String id) {
        etatVehiculeRepository.deleteById(id);
    }

    @Override
    public EtatVehicule getEtatVehiculeById(String id) {
        return etatVehiculeRepository.findById(id).isPresent() ? etatVehiculeRepository.findById(id).get() : null;
    }

    @Override
    public List<EtatVehicule> getAllEtatVehicules() {
        return etatVehiculeRepository.findAll();
    }


    @Override
    public EtatVehicule ajouterEtatVehicule(
            String codeEtat,
            String libelleEtat
    ) {

        EtatVehicule etatVehicule = new EtatVehicule();

        etatVehicule.setCodeEtat(codeEtat);
        etatVehicule.setLibelleEtat(libelleEtat);

        return etatVehiculeRepository.save(etatVehicule);
    }


}
