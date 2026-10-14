package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.employe;
import tn.esprit.mayssem_sallah_4ssa3.repositories.EmployeRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IEmployeService;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeServiceImpl implements IEmployeService {

    EmployeRepository employeRepository;

    @Override
    public employe ajouterEmploye(employe e) { return employeRepository.save(e); }

    @Override
    public employe updateEmploye(employe e) { return employeRepository.save(e); }

    @Override
    public void deleteEmploye(Long id) { employeRepository.deleteById(id); }

    @Override
    public employe getEmploye(Long id) { return employeRepository.findById(id).get(); }

    @Override
    public List<employe> getAllEmployes() { return employeRepository.findAll(); }
}
