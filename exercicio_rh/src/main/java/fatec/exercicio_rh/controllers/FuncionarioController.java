package fatec.exercicio_rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    ModelAndView mv = new ModelAndView("funcionario/listagem");
    mv.addObject("Funcionarios", service.listar());

    return mv;
  }

  // === CADASTRAR === \\

  @GetMapping(value = "/funcionario/cadastrar")
  public ModelAndView formCadastroFuncionario() {
    ModelAndView mv = new ModelAndView("funcionario/cadastro");
    Funcionario f = new Funcionario();
    mv.addObject("Funcionario", f);

    return mv;
  }

  @PostMapping("/funcionario/cadastrar")
  public String cadastrarFuncionario(Funcionario funcionario) {
    service.inserir(funcionario);
    return "redirect:/funcionario/listar";
  }

  // === EDITAR === \\

  @GetMapping(value = "/funcionario/editar")
  public ModelAndView formEdicaoFuncionario(int id) {
    ModelAndView mv = new ModelAndView("funcionario/edicao");
    mv.addObject("Funcionario", service.listar(id));

    return mv;
  }

  @PostMapping("/funcionario/editar")
  public String editarFuncionario(Funcionario funcionario) {
    service.atualizar(funcionario);
    return "redirect:/funcionario/listar";
  }

  // === EXCLUIR === \\
  
  @PostMapping("/funcionario/excluir")
  public String excluirFuncionario(Funcionario funcionario) {
    service.excluir(funcionario);
    return "redirect:/funcionario/listar";
  }

}
