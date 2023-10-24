package fatec.exercicio_rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.exercicio_rh.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
  
}
