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
@Table(name = "super_prof")
public class ProfessorSuper extends PessoaSuper {
    @Id
    @Column(name = "pro_registro", nullable = false)
    private int registro;
    @Column(name = "pro_titulo", nullable = false, length = 20)
    private String titulo;
    @Column(name = "pro_area", nullable = false, length = 20)
    private String area;

}