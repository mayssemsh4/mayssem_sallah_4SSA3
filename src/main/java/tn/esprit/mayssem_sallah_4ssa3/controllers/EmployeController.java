package tn.esprit.mayssem_sallah_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssem_sallah_4ssa3.entité.employe;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IEmployeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/employe")
public class EmployeController {

    IEmployeService employeService;

    @PostMapping("/ajouter")
    public employe ajouterEmploye(@RequestBody employe e) { return employeService.ajouterEmploye(e); }

    @PutMapping("/modifier")
    public employe updateEmploye(@RequestBody employe e) { return employeService.updateEmploye(e); }

    @DeleteMapping("/supprimer/{id}")
    public void deleteEmploye(@PathVariable Long id) { employeService.deleteEmploye(id); }

    @GetMapping("/get/{id}")
    public employe getEmploye(@PathVariable Long id) { return employeService.getEmploye(id); }

    @GetMapping("/getAll")
    public List<employe> getAllEmployes() { return employeService.getAllEmployes(); }
}
