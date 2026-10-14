package tn.esprit.mayssem_sallah_4ssa3.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mayssem_sallah_4ssa3.entité.Client;
import tn.esprit.mayssem_sallah_4ssa3.repositories.ClientRepository;
import tn.esprit.mayssem_sallah_4ssa3.services.interfaces.IClientService;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements IClientService {

    ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client c) { return clientRepository.save(c); }

    @Override
    public Client updateClient(Client c) { return clientRepository.save(c); }

    @Override
    public void deleteClient(Long id) { clientRepository.deleteById(id); }

    @Override
    public Client getClient(Long id) { return clientRepository.findById(id).get(); }

    @Override
    public List<Client> getAllClients() { return clientRepository.findAll(); }
}
