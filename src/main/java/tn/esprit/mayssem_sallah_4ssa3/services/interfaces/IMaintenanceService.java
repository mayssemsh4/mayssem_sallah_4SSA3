package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance m);
    Maintenance updateMaintenance(Maintenance m);
    void deleteMaintenance(Long id);
    Maintenance getMaintenance(Long id);
    List<Maintenance> getAllMaintenances();
}
