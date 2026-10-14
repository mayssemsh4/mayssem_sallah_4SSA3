package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement e);
    Equipement updateEquipement(Equipement e);
    void deleteEquipement(Long id);
    Equipement getEquipement(Long id);
    List<Equipement> getAllEquipements();
}
