package fatec.heranca_db.services.single_table;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.heranca_db.models.single_table.PessoaSingle;
import fatec.heranca_db.repositories.single_table.PessoaRepositorySingle;

@Service
public class PessoaServiceSingle {
    private PessoaRepositorySingle repository;

    public PessoaServiceSingle(PessoaRepositorySingle repository) {
        this.repository = repository;
    }

    public List<PessoaSingle> listarTodos() {
        return repository.findAll();
    }

    public void inserir(PessoaSingle pessoa) {
        repository.save(pessoa);
    }

    public void atualizar(PessoaSingle pessoa) {
        repository.save(pessoa);
    }

    public void excluir(PessoaSingle pessoa) {
        repository.delete(pessoa);
    }
}
