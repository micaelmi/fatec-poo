package fatec.heranca_db.repositories.joined_table;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.heranca_db.models.joined_table.PessoaJoined;

public interface PessoaRepositoryJoined extends JpaRepository<PessoaJoined, String> {

}
