package fatec.heranca_db.repositories.single_table;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.heranca_db.models.single_table.PessoaSingle;

public interface PessoaRepositorySingle extends JpaRepository<PessoaSingle, String> {

}
