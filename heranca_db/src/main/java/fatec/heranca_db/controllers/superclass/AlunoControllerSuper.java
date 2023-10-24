package fatec.heranca_db.controllers.superclass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import fatec.heranca_db.models.superclass.AlunoSuper;
import fatec.heranca_db.services.superclass.AlunoServiceSuper;


@Controller
public class AlunoControllerSuper {
    private AlunoServiceSuper alunoService;

    public AlunoControllerSuper(AlunoServiceSuper aluno) {
        alunoService = aluno;
    }

    @GetMapping(value = "/aluno/super/novo")
    public String novo() {
        AlunoSuper a = new AlunoSuper();
        a.setNome("Micael");
        a.setCpf("399.640.768-86");
        a.setRg("56.818.952-8");
        a.setMae("Margareth");
        a.setPai("Renato");
        a.setCurso("ADS");
        a.setRa("183593002");
        alunoService.inserir(a);
        return "criado";
    }

    @GetMapping(value = "/aluno/super")
    public List<AlunoSuper> listar() {
        List<AlunoSuper> alunos = alunoService.listarTodos();
        ModelAndView mv = new ModelAndView("/listar");
        mv.addObject(null, mv);
        return alunos;
    }

    @GetMapping(value = "/aluno/super/excluir")
    public void excluir(@RequestBody AlunoSuper a) {
        alunoService.excluir(a);
    }

    @GetMapping(value = "/aluno/super/atualizar")
    public void atualizar(AlunoSuper a) {
        alunoService.atualizar(a);
    }
}