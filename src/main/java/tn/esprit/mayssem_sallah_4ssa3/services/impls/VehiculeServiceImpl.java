package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.vehicule;
import tn.esprit.mayssem_sallah_4ssa3.repositories.VehiculeRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IVehiculeService;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeServiceImpl implements IVehiculeService {

    VehiculeRepository vehiculeRepository;

    @Override
    public vehicule ajouterVehicule(vehicule v) { return vehiculeRepository.save(v); }

    @Override
    public vehicule updateVehicule(vehicule v) { return vehiculeRepository.save(v); }

    @Override
    public void deleteVehicule(Long id) { vehiculeRepository.deleteById(id); }

    @Override
    public vehicule getVehicule(Long id) { return vehiculeRepository.findById(id).get(); }

    @Override
    public List<vehicule> getAllVehicules() { return vehiculeRepository.findAll(); }
}
