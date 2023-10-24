package fatec.introducao_banco_spring.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fatec.introducao_banco_spring.model.Cliente;
import fatec.introducao_banco_spring.service.ClienteService;

@Controller
public class ClienteController {
    private ClienteService cv;

    public ClienteController(ClienteService cs) {
        cv = cs;
    }

    @GetMapping(value = "/")
    public String novo() {
        Cliente c = new Cliente();
        c.setNome("Micael");
        c.setNascimento(new Date(Calendar.getInstance().getTimeInMillis()));
        cv.inserir(c);
        return "index";
    }
}
