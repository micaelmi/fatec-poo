package fatec.introducaospring.controllers;

import java.rmi.server.UID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.InitBinderDataBinderFactory;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;
import fatec.introducaospring.IntroducaospringApplication;
import fatec.introducaospring.models.Cliente;

@Controller
public class InicialController {
    
    @GetMapping(value="/")
    public String comeceAqui(){
        return "index";
    }

    @GetMapping(value="/listar")
    public ModelAndView listagem(){
        ModelAndView mv = new ModelAndView("listagem");
        mv.addObject("Clientes", IntroducaospringApplication.listaClientes);

        return mv;
    }

    @GetMapping(value="/novo")
    public ModelAndView novoCliente(){
        ModelAndView mv = new ModelAndView("cadastro");
        Cliente cli = new Cliente();
        mv.addObject("cliente", cli);
        return mv;
    }

    @PostMapping(value="/novo")
    public String salvarCliente(Cliente cliente){
        cliente.setId(new UID());
        IntroducaospringApplication.listaClientes.add(cliente);
        
        return "redirect:/listar";
    }

}
