package fatec.heranca_db.services.joined_table;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.heranca_db.models.superclass.ProfessorSuper;
import fatec.heranca_db.repositories.superclass.ProfessorRepositorySuper;

@Service
public class ProfessorServiceJoined {
    private ProfessorRepositorySuper repository;

    public ProfessorServiceJoined(ProfessorRepositorySuper repository) {
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
