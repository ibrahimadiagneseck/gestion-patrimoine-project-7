package sn.douanes.services;

import sn.douanes.entities.Carburant;

import java.util.List;

public interface CarburantService {

    Carburant saveCarburant(Carburant c);
    Carburant updateCarburant(Carburant c);
    void deleteCarburant(Carburant c);
    void deleteCarburantById(String id);
    Carburant getCarburant(String id);
    List<Carburant> getAllCarburants();


}
