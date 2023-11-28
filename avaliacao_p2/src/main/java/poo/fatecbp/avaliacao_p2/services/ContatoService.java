package poo.fatecbp.avaliacao_p2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import poo.fatecbp.avaliacao_p2.models.Contato;
import poo.fatecbp.avaliacao_p2.repositories.ContatoRepository;

@Service
public class ContatoService {
    private ContatoRepository repository;

    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }

    public List<Contato> listar() {
        return repository.findAll();
    }

    public void inserir(Contato contato) {
        repository.save(contato);
    }
}
