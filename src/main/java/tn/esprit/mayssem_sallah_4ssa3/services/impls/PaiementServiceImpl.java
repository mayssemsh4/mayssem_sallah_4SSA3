package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.Paiement;
import tn.esprit.mayssem_sallah_4ssa3.repositories.PaiementRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IPaiementService;

import java.util.List;

@AllArgsConstructor
@Service
public class PaiementServiceImpl implements IPaiementService {

    PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement p) { return paiementRepository.save(p); }

    @Override
    public Paiement updatePaiement(Paiement p) { return paiementRepository.save(p); }

    @Override
    public void deletePaiement(Long id) { paiementRepository.deleteById(id); }

    @Override
    public Paiement getPaiement(Long id) { return paiementRepository.findById(id).get(); }

    @Override
    public List<Paiement> getAllPaiements() { return paiementRepository.findAll(); }
}
