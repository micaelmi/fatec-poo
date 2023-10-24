package fatec.exercicio_rh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fatec.exercicio_rh.models.Cargo;
import fatec.exercicio_rh.repositories.CargoRepository;

@Service
public class CargoService {
  private CargoRepository repository;

  public CargoService(CargoRepository repository) {
    this.repository = repository;
  }

  public List<Cargo> listar() {
    return repository.findAll();
  }

  public Cargo listar(int id) {
    return repository.findById(id).orElse(null);
  }

  public void inserir(Cargo cargo) {
    repository.save(cargo);
  }

  public void atualizar(Cargo cargo) {
    repository.save(cargo);
  }

  public void excluir(Cargo cargo) {
    repository.delete(cargo);
  }
}
