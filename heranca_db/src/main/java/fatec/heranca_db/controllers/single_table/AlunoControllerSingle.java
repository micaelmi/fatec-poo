package fatec.heranca_db.controllers.single_table;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import fatec.heranca_db.models.single_table.AlunoSingle;
import fatec.heranca_db.services.single_table.PessoaServiceSingle;


@Controller
public class AlunoControllerSingle {
    private PessoaServiceSingle alunoService;

    public AlunoControllerSingle(PessoaServiceSingle aluno) {
        alunoService = aluno;
    }

    @GetMapping(value = "/aluno/single/novo")
    public String novo() {
        AlunoSingle a = new AlunoSingle();
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

    @GetMapping(value = "/aluno/single")
    public List<AlunoSingle> listar() {
        List<AlunoSingle> alunos = alunoService.listarTodos();
        ModelAndView mv = new ModelAndView("/listar");
        mv.addObject(null, mv);
        return alunos;
    }

    @GetMapping(value = "/aluno/single/excluir")
    public void excluir(@RequestBody AlunoSingle a) {
        alunoService.excluir(a);
    }

    @GetMapping(value = "/aluno/single/atualizar")
    public void atualizar(AlunoSuper a) {
        alunoService.atualizar(a);
    }
}