package tn.esprit.mayssem_sallah_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssem_sallah_4ssa3.entité.Equipement;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IEquipementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipement")
public class EquipementController {

    IEquipementService equipementService;

    @PostMapping("/ajouter")
    public Equipement ajouterEquipement(@RequestBody Equipement e) { return equipementService.ajouterEquipement(e); }

    @PutMapping("/modifier")
    public Equipement updateEquipement(@RequestBody Equipement e) { return equipementService.updateEquipement(e); }

    @DeleteMapping("/supprimer/{id}")
    public void deleteEquipement(@PathVariable Long id) { equipementService.deleteEquipement(id); }

    @GetMapping("/get/{id}")
    public Equipement getEquipement(@PathVariable Long id) { return equipementService.getEquipement(id); }

    @GetMapping("/getAll")
    public List<Equipement> getAllEquipements() { return equipementService.getAllEquipements(); }
}
