package fatec.heranca_db.models.single_table;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

@Entity
@DiscriminatorValue(value = "Aluno")
public class AlunoSingle extends PessoaSingle {
    @Column(length = 15, nullable = true, name = "alu_ra")
    private String ra;
    @Column(length = 25, nullable = true, name = "alu_curso")
    private String curso;

}
