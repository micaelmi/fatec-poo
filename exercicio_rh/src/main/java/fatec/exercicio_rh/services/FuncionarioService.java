package fatec.exercicio_rh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.exercicio_rh.models.Funcionario;
import fatec.exercicio_rh.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
  private FuncionarioRepository repository;

  public FuncionarioService(FuncionarioRepository repository) {
    this.repository = repository;
  }

  public List<Funcionario> listar() {
    return repository.findAll();
  }

  public Funcionario listar(int id) {
    return repository.findById(id).orElse(null);
  }

  public void inserir(Funcionario funcionario) {
    repository.save(funcionario);
  }

  public void atualizar(Funcionario funcionario) {
    repository.save(funcionario);
  }

  public void excluir(Funcionario funcionario) {
    repository.delete(funcionario);
  }
}
