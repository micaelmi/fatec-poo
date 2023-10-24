package fatec.heranca_db.models.single_table;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

@Entity
@DiscriminatorValue(value = "Professor")
public class ProfessorSingle extends PessoaSingle {
    @Column(name = "pro_registro", nullable = true)
    private int registro;
    @Column(name = "pro_titulo", nullable = true, length = 20)
    private String titulo;
    @Column(name = "pro_area", nullable = true, length = 20)
    private String area;

}