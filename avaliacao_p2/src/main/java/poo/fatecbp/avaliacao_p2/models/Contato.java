package poo.fatecbp.avaliacao_p2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)

@Entity
@Table(name = "mi_contato")
public class Contato {
    @Id
    @Column(name = "con_numero", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;

    @Column(name = "con_tipo", length = 30, nullable = false)
    private String tipo;
    
    @Column(name = "con_conteudo", length = 50, nullable = false)
    private String conteudo;

    @ManyToOne
    @JoinColumn(name = "cli_numero")
    private Cliente cliente;
}
