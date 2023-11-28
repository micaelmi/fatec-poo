package poo.fatecbp.avaliacao_p2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import poo.fatecbp.avaliacao_p2.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
}
