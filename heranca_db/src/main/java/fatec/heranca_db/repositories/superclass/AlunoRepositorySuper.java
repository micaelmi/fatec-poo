package fatec.heranca_db.repositories.superclass;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.heranca_db.models.superclass.AlunoSuper;

public interface AlunoRepositorySuper extends JpaRepository<AlunoSuper, String> {

}
