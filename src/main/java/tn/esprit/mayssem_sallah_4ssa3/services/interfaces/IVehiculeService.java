package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.vehicule;
import java.util.List;

public interface IVehiculeService {
    vehicule ajouterVehicule(vehicule v);
    vehicule updateVehicule(vehicule v);
    void deleteVehicule(Long id);
    vehicule getVehicule(Long id);
    List<vehicule> getAllVehicules();
}
