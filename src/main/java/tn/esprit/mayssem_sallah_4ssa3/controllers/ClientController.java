package tn.esprit.mayssem_sallah_4ssa3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mayssem_sallah_4ssa3.entité.Client;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IClientService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

    IClientService clientService;

    @PostMapping("/ajouter")
    public Client ajouterClient(@RequestBody Client c) { return clientService.ajouterClient(c); }

    @PutMapping("/modifier")
    public Client updateClient(@RequestBody Client c) { return clientService.updateClient(c); }

    @DeleteMapping("/supprimer/{id}")
    public void deleteClient(@PathVariable Long id) { clientService.deleteClient(id); }

    @GetMapping("/get/{id}")
    public Client getClient(@PathVariable Long id) { return clientService.getClient(id); }

    @GetMapping("/getAll")
    public List<Client> getAllClients() { return clientService.getAllClients(); }
}
