package fatec.heranca_db.models.superclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

@Entity
@Table(name = "super_aluno")
public class AlunoSuper extends PessoaSuper {
    @Id
    @Column(length = 15, nullable = false, name = "alu_ra")
    private String ra;
    @Column(length = 25, nullable = false, name = "alu_curso")
    private String curso;

}
