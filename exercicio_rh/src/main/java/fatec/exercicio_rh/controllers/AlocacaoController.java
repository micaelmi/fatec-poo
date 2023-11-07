package fatec.exercicio_rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fatec.exercicio_rh.models.Alocacao;
import fatec.exercicio_rh.services.AlocacaoService;
import fatec.exercicio_rh.services.CargoService;
import fatec.exercicio_rh.services.FuncionarioService;

@Controller
public class AlocacaoController {
  private AlocacaoService alocacaoService;
  private FuncionarioService funcionarioService;
  private CargoService cargoService;

  public AlocacaoController(
      AlocacaoService alocacaoService,
      FuncionarioService funcionarioService,
      CargoService cargoService) {
    this.alocacaoService = alocacaoService;
    this.funcionarioService = funcionarioService;
    this.cargoService = cargoService;
  }

  // === LISTAR === \\

  @GetMapping(value = "/alocacao/listar")
  public ModelAndView listar() {
    ModelAndView mv = new ModelAndView("alocacao/listar");
    mv.addObject("Alocacoes", alocacaoService.listar());

    return mv;
  }

  // === CADASTRAR === \\

  @GetMapping(value = "/alocacao/cadastrar")
  public ModelAndView formCadastroalocacao() {
    ModelAndView mv = new ModelAndView("alocacao/cadastrar");
    Alocacao a = new Alocacao();
    mv.addObject("Alocacao", a);
    mv.addObject("Funcionario", funcionarioService.listar());
    mv.addObject("Cargo", cargoService.listar());

    return mv;
  }

  @PostMapping("/alocacao/cadastrar")
  public String cadastrarAlocacao(Alocacao alocacao) {
    alocacaoService.inserir(alocacao);
    return "redirect:/alocacao/listar";
  }

  // === EDITAR === \\

  @GetMapping(value = "/alocacao/editar")
  public ModelAndView formEdicaoAlocacao(@RequestParam int id) {
    ModelAndView mv = new ModelAndView("alocacao/editar");
    mv.addObject("Alocacao", alocacaoService.listar(id));
    mv.addObject("Funcionario", funcionarioService.listar());
    mv.addObject("Cargo", cargoService.listar());

    return mv;
  }

  @PostMapping("/alocacao/editar")
  public String editarAlocacao(Alocacao alocacao) {
    alocacaoService.atualizar(alocacao);
    return "redirect:/alocacao/listar";
  }

  // === EXCLUIR === \\

  @GetMapping("/alocacao/excluir")
  public String excluirAlocacao(@RequestParam int id) {
    alocacaoService.excluir(id);
    return "redirect:/alocacao/listar";
  }

}
