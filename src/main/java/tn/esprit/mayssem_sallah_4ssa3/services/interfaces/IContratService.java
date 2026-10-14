package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat c);
    Contrat updateContrat(Contrat c);
    void deleteContrat(Long id);
    Contrat getContrat(Long id);
    List<Contrat> getAllContrats();
}
