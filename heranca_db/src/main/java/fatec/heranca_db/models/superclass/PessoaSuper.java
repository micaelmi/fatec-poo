package fatec.heranca_db.models.superclass;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data

@MappedSuperclass
public class PessoaSuper implements Serializable {
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 12, nullable = false)
    private String rg;
    @Column(length = 16, nullable = false)
    private String cpf;
    @Column(length = 25)
    private String pai;
    @Column(length = 25)
    private String mae;
}
