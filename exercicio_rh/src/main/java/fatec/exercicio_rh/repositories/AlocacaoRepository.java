package fatec.exercicio_rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.exercicio_rh.models.Alocacao;

public interface AlocacaoRepository extends JpaRepository<Alocacao, Integer> {
    
}
