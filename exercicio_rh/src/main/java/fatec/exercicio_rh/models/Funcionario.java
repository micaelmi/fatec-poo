package fatec.exercicio_rh.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "TB_funcionario")
public class Funcionario {
    @Id
    @Column(name = "fun_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fun_nome", length = 30, nullable = false)
    private String nome;
    
    @Column(name = "fun_ctps", length = 30, nullable = false)
    private String ctps;
    
    @Column(name = "fun_admissao", nullable = false)
    private LocalDate admissao;
    
    @Column(name = "fun_rescisao", nullable = true)
    private LocalDate rescisao;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Set<Alocacao> alocacoes = new HashSet<>();
}
