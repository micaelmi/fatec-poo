package poo.fatecbp.avaliacao_p2.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)

@Entity
@Table(name = "mi_cliente")
public class Cliente {
    @Id
    @Column(name = "cli_numero", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;

    @Column(name = "cli_nome", length = 30, nullable = false)
    private String nome;
    
    @Column(name = "cli_cpf", length = 20, nullable = false)
    private String cpf;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contato> contatos = new ArrayList<>();
}
