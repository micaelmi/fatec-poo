package fatec.introducaospring.models;

import java.rmi.server.UID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(includeFieldNames=true)
public class Cliente {
    private UID id;
    private String nome;
    private LocalDateTime nascimento;

    public void  setNascimento(String data){
        this.nascimento = LocalDateTime.parse(data+"T00:00");
    }
    public void setNascimento(LocalDateTime data){
        this.nascimento = data;
    }
}
