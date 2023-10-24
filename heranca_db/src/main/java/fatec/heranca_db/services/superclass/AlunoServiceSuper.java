package fatec.heranca_db.services.superclass;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.heranca_db.models.superclass.AlunoSuper;
import fatec.heranca_db.repositories.superclass.AlunoRepositorySuper;

@Service
public class AlunoServiceSuper {
    private AlunoRepositorySuper repository;

    public AlunoServiceSuper(AlunoRepositorySuper repository) { // @Autowired: abreviação do construtor
        this.repository = repository;
    }

    public List<AlunoSuper> listarTodos() {
        return repository.findAll();
    }

    public void inserir(AlunoSuper aluno) {
        repository.save(aluno);
    }

    public void atualizar(AlunoSuper aluno) {
        repository.save(aluno);
    }

    public void excluir(AlunoSuper aluno) {
        repository.delete(aluno);
    }
}
