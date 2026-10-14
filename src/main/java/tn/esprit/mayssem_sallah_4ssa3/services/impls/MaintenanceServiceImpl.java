package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.Maintenance;
import tn.esprit.mayssem_sallah_4ssa3.repositories.MaintenaceRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IMaintenanceService;

import java.util.List;

@AllArgsConstructor
@Service
public class MaintenanceServiceImpl implements IMaintenanceService {

    MaintenaceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance m) { return maintenanceRepository.save(m); }

    @Override
    public Maintenance updateMaintenance(Maintenance m) { return maintenanceRepository.save(m); }

    @Override
    public void deleteMaintenance(Long id) { maintenanceRepository.deleteById(id); }

    @Override
    public Maintenance getMaintenance(Long id) { return maintenanceRepository.findById(id).get(); }

    @Override
    public List<Maintenance> getAllMaintenances() { return maintenanceRepository.findAll(); }
}
