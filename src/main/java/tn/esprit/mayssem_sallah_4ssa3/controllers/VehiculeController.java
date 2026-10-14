package tn.esprit.mayssem_sallah_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssem_sallah_4ssa3.entité.vehicule;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IVehiculeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

    IVehiculeService vehiculeService;

    @PostMapping("/ajouter")
    public vehicule ajouterVehicule(@RequestBody vehicule v) { return vehiculeService.ajouterVehicule(v); }

    @PutMapping("/modifier")
    public vehicule updateVehicule(@RequestBody vehicule v) { return vehiculeService.updateVehicule(v); }

    @DeleteMapping("/supprimer/{id}")
    public void deleteVehicule(@PathVariable Long id) { vehiculeService.deleteVehicule(id); }

    @GetMapping("/get/{id}")
    public vehicule getVehicule(@PathVariable Long id) { return vehiculeService.getVehicule(id); }

    @GetMapping("/getAll")
    public List<vehicule> getAllVehicules() { return vehiculeService.getAllVehicules(); }
}
