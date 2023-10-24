package fatec.heranca_db.repositories.table_per_class;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.heranca_db.models.table_per_class.AlunoTablePerClass;


public interface AlunoRepositoryPerClass extends JpaRepository<AlunoTablePerClass, String> {

}
