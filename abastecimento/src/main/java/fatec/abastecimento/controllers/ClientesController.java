package fatec.abastecimento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ClientesController {
  
  @GetMapping("/")
  public String ola() {
    return "ola";
  }
}
