package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.Equipement;
import tn.esprit.mayssem_sallah_4ssa3.repositories.EquipementRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IEquipementService;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipementServiceImpl implements IEquipementService {

    EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement e) { return equipementRepository.save(e); }

    @Override
    public Equipement updateEquipement(Equipement e) { return equipementRepository.save(e); }

    @Override
    public void deleteEquipement(Long id) { equipementRepository.deleteById(id); }

    @Override
    public Equipement getEquipement(Long id) { return equipementRepository.findById(id).get(); }

    @Override
    public List<Equipement> getAllEquipements() { return equipementRepository.findAll(); }
}
