package fatec.heranca_db.services.table_per_class;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.heranca_db.models.table_per_class.AlunoTablePerClass;
import fatec.heranca_db.repositories.table_per_class.AlunoRepositoryPerClass;

@Service
public class AlunoServicePerClass {
    private AlunoRepositoryPerClass repository;

    public AlunoServicePerClass(AlunoRepositoryPerClass repository) {
        this.repository = repository;
    }

    public List<AlunoTablePerClass> listarTodos() {
        return repository.findAll();
    }

    public void inserir(AlunoTablePerClass aluno) {
        repository.save(aluno);
    }

    public void atualizar(AlunoTablePerClass aluno) {
        repository.save(aluno);
    }

    public void excluir(AlunoTablePerClass aluno) {
        repository.delete(aluno);
    }
}
