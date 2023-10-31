package fatec.exercicio_rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fatec.exercicio_rh.models.Funcionario;
import fatec.exercicio_rh.services.FuncionarioService;

@Controller
public class FuncionarioController {
  private FuncionarioService service;

  public FuncionarioController(FuncionarioService service) {
    this.service = service;
  }

  // === HOME === \\

  @GetMapping(value = "/")
  public String init() {
    return "index";
  }

  // === LISTAR === \\

  @GetMapping(value = "/funcionario/listar")
  public ModelAndView listar() {
    ModelAndView mv = new ModelAndView("funcionario/listar");
    mv.addObject("Funcionarios", service.listar());

    return mv;
  }

  // === CADASTRAR === \\

  @GetMapping(value = "/funcionario/cadastrar")
  public ModelAndView formCadastroFuncionario() {
    ModelAndView mv = new ModelAndView("funcionario/cadastrar");
    Funcionario f = new Funcionario();
    mv.addObject("Funcionario", f);

    return mv;
  }

  @PostMapping(value = "/funcionario/cadastrar")
  public String cadastrarFuncionario(Funcionario funcionario) {
    service.inserir(funcionario);
    return "redirect:/funcionario/listar";
  }

  // === EDITAR === \\

  @GetMapping(value = "/funcionario/editar")
  public ModelAndView formEdicaoFuncionario(@RequestParam int id) {
    ModelAndView mv = new ModelAndView("funcionario/editar");
    mv.addObject("Funcionario", service.listar(id));

    return mv;
  }

  @PostMapping(value = "/funcionario/editar")
  public String editarFuncionario(Funcionario funcionario) {
    service.atualizar(funcionario);
    return "redirect:/funcionario/listar";
  }

  // === EXCLUIR === \\
  
  @GetMapping(value = "/funcionario/excluir")
  public String excluirFuncionario(@RequestParam int id) {
    // Funcionario funcionario = service.listar(id);
    service.excluir(id);
    return "redirect:/funcionario/listar";
  }

}
