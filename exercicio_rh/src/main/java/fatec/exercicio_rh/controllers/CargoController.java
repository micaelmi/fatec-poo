package fatec.exercicio_rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fatec.exercicio_rh.models.Cargo;
import fatec.exercicio_rh.services.CargoService;

@Controller
public class CargoController {
  private CargoService service;

  public CargoController(CargoService service) {
    this.service = service;
  }

  // === LISTAR === \\

  @GetMapping(value = "/cargo/listar")
  public ModelAndView listar() {
    ModelAndView mv = new ModelAndView("cargo/listar");
    mv.addObject("Cargos", service.listar());

    return mv;
  }

  // === CADASTRAR === \\

  @GetMapping(value = "/cargo/cadastrar")
  public ModelAndView formCadastroCargo() {
    ModelAndView mv = new ModelAndView("cargo/cadastrar");
    Cargo f = new Cargo();
    mv.addObject("Cargo", f);

    return mv;
  }

  @PostMapping("/cargo/cadastrar")
  public String cadastrarCargo(Cargo cargo) {
    service.inserir(cargo);
    return "redirect:/cargo/listar";
  }

  // === EDITAR === \\

  @GetMapping(value = "/cargo/editar")
  public ModelAndView formEdicaoCargo(@RequestParam int id) {
    ModelAndView mv = new ModelAndView("cargo/editar");
    mv.addObject("Cargo", service.listar(id));

    return mv;
  }

  @PostMapping("/cargo/editar")
  public String editarCargo(Cargo cargo) {
    service.atualizar(cargo);
    return "redirect:/cargo/listar";
  }

  // === EXCLUIR === \\
  
  @GetMapping("/cargo/excluir")
  public String excluirCargo(@RequestParam int id) {
    service.excluir(id);
    return "redirect:/cargo/listar";
  }

}
