package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.employe;
import java.util.List;

public interface IEmployeService {
    employe ajouterEmploye(employe e);
    employe updateEmploye(employe e);
    void deleteEmploye(Long id);
    employe getEmploye(Long id);
    List<employe> getAllEmployes();
}
