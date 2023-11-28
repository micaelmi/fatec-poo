package poo.fatecbp.avaliacao_p2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import poo.fatecbp.avaliacao_p2.models.Cliente;
import poo.fatecbp.avaliacao_p2.repositories.ClienteRepository;

@Service
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }
}
