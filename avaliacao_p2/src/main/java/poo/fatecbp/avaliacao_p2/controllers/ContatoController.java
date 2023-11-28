package poo.fatecbp.avaliacao_p2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import poo.fatecbp.avaliacao_p2.models.Contato;
import poo.fatecbp.avaliacao_p2.services.ClienteService;
import poo.fatecbp.avaliacao_p2.services.ContatoService;

@Controller
public class ContatoController {
  private ContatoService service;
  private ClienteService clienteService;

  public ContatoController(ContatoService service, ClienteService clienteService) {
    this.service = service;
    this.clienteService = clienteService;
  }

  // === LISTAR === \\

  @GetMapping(value = "/")
  public ModelAndView listar() {
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("Contatos", service.listar());

    return mv;
  }

  // === CADASTRAR === \\

  @GetMapping(value = "/cadastrar")
  public ModelAndView formCadastroContato() {
    ModelAndView mv = new ModelAndView("cadastrar");
    Contato c = new Contato();
    mv.addObject("Contato", c);
    mv.addObject("Cliente", clienteService.listar());

    return mv;
  }

  @PostMapping("/cadastrar")
  public String cadastrarContato(Contato contato) {
    service.inserir(contato);
    return "redirect:/";
  }
}
