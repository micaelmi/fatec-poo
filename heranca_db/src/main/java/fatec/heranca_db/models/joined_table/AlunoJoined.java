package fatec.heranca_db.models.joined_table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

@Entity
@Table(name = "joined_aluno")
@PrimaryKeyJoinColumn(referencedColumnName = "cpf")
public class AlunoJoined extends PessoaJoined {
    @Column(length = 15, nullable = false, name = "alu_ra", unique = true)
    private String ra;
    @Column(length = 25, nullable = false, name = "alu_curso")
    private String curso;
}
