package sn.douanes.gestionPatrimoineVehiculeSpringBoot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.gestionPatrimoineVehiculeSpringBoot.entities.TypeArme;
import sn.douanes.gestionPatrimoineVehiculeSpringBoot.repositories.TypeArmeRepository;
import sn.douanes.gestionPatrimoineVehiculeSpringBoot.services.TypeArmeService;


@Service
public class TypeArmeServiceImpl implements TypeArmeService {

    @Autowired
    TypeArmeRepository typeArmeRepository;

    @Override
    public TypeArme saveTypeArme(TypeArme t) {
        return typeArmeRepository.save(t);
    }

    @Override
    public TypeArme updateTypeArme(TypeArme t) {
        return typeArmeRepository.save(t);
    }

    @Override
    public void deleteTypeArme(TypeArme t) {
        typeArmeRepository.delete(t);
    }

    @Override
    public void deleteTypeArmeById(String id) {
        typeArmeRepository.deleteById(id);
    }

    @Override
    public TypeArme getTypeArme(String id) {
        return typeArmeRepository.findById(id).get();
    }

    @Override
    public List<TypeArme> getAllTypeArmes() {
        return typeArmeRepository.findAll();
    }



}
