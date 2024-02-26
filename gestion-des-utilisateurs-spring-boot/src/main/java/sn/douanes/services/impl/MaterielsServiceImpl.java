package sn.douanes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.entities.Materiels;
import sn.douanes.repositories.MaterielsRepository;
import sn.douanes.services.MaterielsService;

import java.util.List;


@Service
public class MaterielsServiceImpl implements MaterielsService {

    @Autowired
    MaterielsRepository materielsRepository;

    @Override
    public Materiels saveMateriels(Materiels m) {
        return materielsRepository.save(m);
    }

    @Override
    public Materiels updateMateriels(Materiels m) {
        return materielsRepository.save(m);
    }

    @Override
    public void deleteMateriels(Materiels m) {
        materielsRepository.delete(m);
    }

    @Override
    public void deleteMaterielsById(String id) {
        materielsRepository.deleteById(id);
    }

    @Override
    public Materiels getMateriels(String id) {
        return materielsRepository.findById(id).get();
    }

    @Override
    public List<Materiels> getAllMateriels() {
        return materielsRepository.findAll();
    }



}
