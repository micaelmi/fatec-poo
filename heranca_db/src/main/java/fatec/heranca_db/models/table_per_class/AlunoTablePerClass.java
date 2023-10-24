package fatec.heranca_db.models.table_per_class;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

@Entity
@Table(name = "table_per_class_aluno")
public class AlunoTablePerClass extends PessoaTablePerClass {
    @Column(length = 15, nullable = false, name = "alu_ra", unique = true)
    private String ra;
    @Column(length = 25, nullable = false, name = "alu_curso")
    private String curso;

}
