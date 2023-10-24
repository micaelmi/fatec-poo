package fatec.heranca_db.services.joined_table;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.heranca_db.models.joined_table.AlunoJoined;
import fatec.heranca_db.repositories.joined_table.AlunoRepositoryJoined;

@Service
public class AlunoServiceJoined {
    private AlunoRepositoryJoined repository;

    public AlunoServiceJoined(AlunoRepositoryJoined repository) {
        this.repository = repository;
    }

    public List<AlunoJoined> listarTodos() {
        return repository.findAll();
    }

    public void inserir(AlunoJoined aluno) {
        repository.save(aluno);
    }

    public void atualizar(AlunoJoined aluno) {
        repository.save(aluno);
    }

    public void excluir(AlunoJoined aluno) {
        repository.delete(aluno);
    }
}
