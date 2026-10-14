package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.agence;
import tn.esprit.mayssem_sallah_4ssa3.repositories.AgenceRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IAgenceService;

import java.util.List;

@AllArgsConstructor
@Service
public class AgenceServiceImpl implements IAgenceService {

    AgenceRepository agenceRepository;

    @Override
    public agence ajouterAgence(agence a) { return agenceRepository.save(a); }

    @Override
    public agence updateAgence(agence a) { return agenceRepository.save(a); }

    @Override
    public void deleteAgence(Long id) { agenceRepository.deleteById(id); }

    @Override
    public agence getAgence(Long id) { return agenceRepository.findById(id).get(); }

    @Override
    public List<agence> getAllAgences() { return agenceRepository.findAll(); }
}
