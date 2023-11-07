package fatec.exercicio_rh.models;

import java.time.LocalDate;

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
@Table(name = "TB_alocacao")
public class Alocacao {
    @Id
    @Column(name = "alo_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "alo_horas_mes", nullable = false)
    private int horas_mes;
    
    @Column(name = "alo_inicio", nullable = false)
    private LocalDate inicio;
    
    @Column(name = "alo_fim", nullable = true)
    private LocalDate fim;

    @ManyToOne
    @JoinColumn(name = "fun_id")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cargo cargo;
}