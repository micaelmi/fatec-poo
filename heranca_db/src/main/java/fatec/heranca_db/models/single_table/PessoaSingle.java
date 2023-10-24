package fatec.heranca_db.models.single_table;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "single_pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class PessoaSingle implements Serializable {
    @Id
    @Column(length = 16, nullable = false)
    private String cpf;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 12, nullable = false)
    private String rg;
    @Column(length = 25)
    private String pai;
    @Column(length = 25)
    private String mae;
}
