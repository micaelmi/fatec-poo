package fatec.introducao_banco_spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.introducao_banco_spring.model.Cliente;
import fatec.introducao_banco_spring.repository.ClienteRepository;

@Service
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public void inserir(Cliente cliente) {
        repository.save(cliente);
    }

    public void atualizar(Cliente cliente) {
        repository.save(cliente);
    }

    public void excluir(Cliente cliente) {
        repository.delete(cliente);
    }
}
