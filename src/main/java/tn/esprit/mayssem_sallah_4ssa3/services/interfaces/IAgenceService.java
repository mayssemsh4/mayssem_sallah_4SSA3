package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.agence;
import java.util.List;

public interface IAgenceService {
    agence ajouterAgence(agence a);
    agence updateAgence(agence a);
    void deleteAgence(Long id);
    agence getAgence(Long id);
    List<agence> getAllAgences();
}
