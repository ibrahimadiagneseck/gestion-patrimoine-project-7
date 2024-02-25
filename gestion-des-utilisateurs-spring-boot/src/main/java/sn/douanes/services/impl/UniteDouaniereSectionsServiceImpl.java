package sn.douanes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.model.Sections;
import sn.douanes.model.UniteDouaniere;
import sn.douanes.model.UniteDouaniereSections;
import sn.douanes.model.keys.UniteDouaniereSectionsId;
import sn.douanes.repository.UniteDouaniereSectionsRepository;
import sn.douanes.services.UniteDouaniereSectionsService;

import java.util.List;


@Service
public class UniteDouaniereSectionsServiceImpl implements UniteDouaniereSectionsService {

    private final UniteDouaniereSectionsRepository uniteDouaniereSectionsRepository;

    @Autowired
    public UniteDouaniereSectionsServiceImpl(UniteDouaniereSectionsRepository uniteDouaniereSectionsRepository) {
        this.uniteDouaniereSectionsRepository = uniteDouaniereSectionsRepository;
    }

    @Override
    public UniteDouaniereSections saveUniteDouaniereSections(UniteDouaniereSections p) {
        return uniteDouaniereSectionsRepository.save(p);
    }

    @Override
    public UniteDouaniereSections updateUniteDouaniereSections(UniteDouaniereSections p) {
        return uniteDouaniereSectionsRepository.save(p);
    }

    @Override
    public void deleteUniteDouaniereSections(UniteDouaniereSections p) {
        uniteDouaniereSectionsRepository.delete(p);
    }

    @Override
    public void deleteUniteDouaniereSectionsById(UniteDouaniere codeUniteDouaniere, Sections codeSection) {
        uniteDouaniereSectionsRepository.deleteById(new UniteDouaniereSectionsId(codeUniteDouaniere, codeSection));
    }

    @Override
    public UniteDouaniereSections getUniteDouaniereSectionsById(UniteDouaniere codeUniteDouaniere, Sections codeSection) {
        return uniteDouaniereSectionsRepository.findById(new UniteDouaniereSectionsId(codeUniteDouaniere, codeSection)).isPresent() ? uniteDouaniereSectionsRepository.findById(new UniteDouaniereSectionsId(codeUniteDouaniere, codeSection)).get() : null;
    }

    @Override
    public List<UniteDouaniereSections> getAllUniteDouaniereSections() {
        return uniteDouaniereSectionsRepository.findAll();
    }


    @Override
    public UniteDouaniereSections ajouterUniteDouaniereSections(
            UniteDouaniere codeUniteDouaniere,
            Sections codeSection
    ) {
        UniteDouaniereSections uniteDouaniereSections = new UniteDouaniereSections();

        uniteDouaniereSections.setCodeUniteDouaniere(codeUniteDouaniere);
        uniteDouaniereSections.setCodeSection(codeSection);

        return uniteDouaniereSectionsRepository.save(uniteDouaniereSections);
    }


}
