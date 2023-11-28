package poo.fatecbp.avaliacao_p2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import poo.fatecbp.avaliacao_p2.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
