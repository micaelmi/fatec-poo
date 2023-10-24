package fatec.heranca_db.repositories.superclass;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.heranca_db.models.superclass.ProfessorSuper;

public interface ProfessorRepositorySuper extends JpaRepository<ProfessorSuper, Integer> {

}
