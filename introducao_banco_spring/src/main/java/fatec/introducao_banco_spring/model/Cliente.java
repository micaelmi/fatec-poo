package fatec.introducao_banco_spring.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(includeFieldNames = true)

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cli_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cli_nome", length = 50, nullable = false)
    private String nome;

    @Column(name = "cli_nascimento", nullable = true)
    private Date nascimento;
}
