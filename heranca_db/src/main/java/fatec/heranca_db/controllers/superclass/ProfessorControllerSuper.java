package fatec.heranca_db.controllers.superclass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fatec.heranca_db.models.superclass.ProfessorSuper;
import fatec.heranca_db.services.superclass.ProfessorServiceSuper;


@Controller
public class ProfessorControllerSuper {
    private ProfessorServiceSuper professorService;

    public ProfessorControllerSuper(ProfessorServiceSuper professor) {
        professorService = professor;
    }

    @GetMapping(value = "/professor")
    public String novo() {
        ProfessorSuper p = new ProfessorSuper();
        p.setNome("Luciano");
        p.setCpf("122.841.307-26");
        p.setRg("26.369.758-8");
        p.setMae("Lucia");
        p.setPai("Lucio");
        p.setRegistro(10);
        p.setArea("TI");
        p.setTitulo("Mestre");
        professorService.inserir(p);
        return "criado";
    }
}