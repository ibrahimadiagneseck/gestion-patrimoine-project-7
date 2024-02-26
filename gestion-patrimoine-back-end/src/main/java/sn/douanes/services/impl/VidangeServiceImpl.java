package sn.douanes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.douanes.entities.Vidange;
import sn.douanes.repositories.VidangeRepository;
import sn.douanes.services.VidangeService;

import java.util.List;


@Service
public class VidangeServiceImpl implements VidangeService {

    @Autowired
    VidangeRepository vidangeRepository;

    @Override
    public Vidange saveVidange(Vidange v) {
        return vidangeRepository.save(v);
    }

    @Override
    public Vidange updateVidange(Vidange v) {
        return vidangeRepository.save(v);
    }

    @Override
    public void deleteVidange(Vidange v) {
        vidangeRepository.delete(v);
    }

    @Override
    public void deleteVidangeById(String id) {
        vidangeRepository.deleteById(id);
    }

    @Override
    public Vidange getVidange(String id) {
        return vidangeRepository.findById(id).get();
    }

    @Override
    public List<Vidange> getAllVidanges() {
        return vidangeRepository.findAll();
    }



}
