package fatec.exercicio_rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.exercicio_rh.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
  
}
