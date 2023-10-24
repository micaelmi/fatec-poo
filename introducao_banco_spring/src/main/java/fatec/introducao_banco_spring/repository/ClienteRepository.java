package fatec.introducao_banco_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.introducao_banco_spring.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
