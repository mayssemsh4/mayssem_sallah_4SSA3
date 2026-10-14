package tn.esprit.mayssem_sallah_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssem_sallah_4ssa3.entité.Paiement;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IPaiementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/paiement")
public class PaiementController {

    IPaiementService paiementService;

    @PostMapping("/ajouter")
    public Paiement ajouterPaiement(@RequestBody Paiement p) { return paiementService.ajouterPaiement(p); }

    @PutMapping("/modifier")
    public Paiement updatePaiement(@RequestBody Paiement p) { return paiementService.updatePaiement(p); }

    @DeleteMapping("/supprimer/{id}")
    public void deletePaiement(@PathVariable Long id) { paiementService.deletePaiement(id); }

    @GetMapping("/get/{id}")
    public Paiement getPaiement(@PathVariable Long id) { return paiementService.getPaiement(id); }

    @GetMapping("/getAll")
    public List<Paiement> getAllPaiements() { return paiementService.getAllPaiements(); }
}
