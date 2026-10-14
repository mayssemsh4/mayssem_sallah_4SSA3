package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement p);
    Paiement updatePaiement(Paiement p);
    void deletePaiement(Long id);
    Paiement getPaiement(Long id);
    List<Paiement> getAllPaiements();
}
