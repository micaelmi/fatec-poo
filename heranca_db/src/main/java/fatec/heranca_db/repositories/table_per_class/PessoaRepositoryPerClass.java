package fatec.heranca_db.repositories.table_per_class;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.heranca_db.models.table_per_class.PessoaTablePerClass;

public interface PessoaRepositoryPerClass extends JpaRepository<PessoaTablePerClass, String> {

}
