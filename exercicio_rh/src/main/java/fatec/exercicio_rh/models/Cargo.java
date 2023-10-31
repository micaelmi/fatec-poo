package fatec.exercicio_rh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)

@Entity
@Table(name = "TB_cargo")
public class Cargo {
    @Id
    @Column(name = "car_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "car_nome", length = 30, nullable = false)
    private String nome;
    
    @Column(name = "car_descricao", length = 30, nullable = false)
    private String descricao;
    
    @Column(name = "car_salario", nullable = false, columnDefinition = "decimal(10,2)")
    private double salario;
}
