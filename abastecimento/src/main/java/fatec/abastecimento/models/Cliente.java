package fatec.abastecimento.models;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente extends Pessoa {
  private Calendar nascimento;
  
}
