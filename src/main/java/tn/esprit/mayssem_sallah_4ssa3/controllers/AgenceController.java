package tn.esprit.mayssem_sallah_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssem_sallah_4ssa3.entité.agence;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IAgenceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/agence")
public class AgenceController {

    IAgenceService agenceService;

    @PostMapping("/ajouter")
    public agence ajouterAgence(@RequestBody agence a) { return agenceService.ajouterAgence(a); }

    @PutMapping("/modifier")
    public agence updateAgence(@RequestBody agence a) { return agenceService.updateAgence(a); }

    @DeleteMapping("/supprimer/{id}")
    public void deleteAgence(@PathVariable Long id) { agenceService.deleteAgence(id); }

    @GetMapping("/get/{id}")
    public agence getAgence(@PathVariable Long id) { return agenceService.getAgence(id); }

    @GetMapping("/getAll")
    public List<agence> getAllAgences() { return agenceService.getAllAgences(); }
}
