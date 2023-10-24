package fatec.heranca_db.services.table_per_class;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.heranca_db.models.superclass.ProfessorSuper;
import fatec.heranca_db.repositories.superclass.ProfessorRepositorySuper;

@Service
public class ProfessorServicePerClass {
    private ProfessorRepositorySuper repository;

    public ProfessorServicePerClass(ProfessorRepositorySuper repository) {
        this.repository = repository;
    }

    public List<ProfessorSuper> listarTodos() {
        return repository.findAll();
    }

    public void inserir(ProfessorSuper professor) {
        repository.save(professor);
    }

    public void atualizar(ProfessorSuper professor) {
        repository.save(professor);
    }

    public void excluir(ProfessorSuper professor) {
        repository.delete(professor);
    }
}
