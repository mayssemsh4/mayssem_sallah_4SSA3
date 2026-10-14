package tn.esprit.mayssem_sallah_4ssa3.services.interfaces;

import tn.esprit.mayssem_sallah_4ssa3.entité.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client c);
    Client updateClient(Client c);
    void deleteClient(Long id);
    Client getClient(Long id);
    List<Client> getAllClients();
}
