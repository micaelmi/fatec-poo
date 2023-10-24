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
@Table(name = "joined_prof")
@PrimaryKeyJoinColumn(referencedColumnName = "cpf")
public class ProfessorJoined extends PessoaJoined {
    @Column(name = "pro_registro", nullable = false, unique = true)
    private int registro;
    @Column(name = "pro_titulo", nullable = false, length = 20)
    private String titulo;
    @Column(name = "pro_area", nullable = false, length = 20)
    private String area;
}