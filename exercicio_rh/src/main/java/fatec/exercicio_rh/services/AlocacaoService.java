package fatec.exercicio_rh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.exercicio_rh.models.Alocacao;
import fatec.exercicio_rh.repositories.AlocacaoRepository;

@Service
public class AlocacaoService {
    private AlocacaoRepository repository;

  public AlocacaoService(AlocacaoRepository repository) {
    this.repository = repository;
  }

  public List<Alocacao> listar() {
    return repository.findAll();
  }

  public Alocacao listar(int id) {
    return repository.findById(id).orElse(null);
  }

  public void inserir(Alocacao alocacao) {
    repository.save(alocacao);
  }

  public void atualizar(Alocacao alocacao) {
    repository.save(alocacao);
  }

  public void excluir(int id) {
    Alocacao alocacao = repository.findById(id).orElse(null);
    repository.delete(alocacao);
  }
}
