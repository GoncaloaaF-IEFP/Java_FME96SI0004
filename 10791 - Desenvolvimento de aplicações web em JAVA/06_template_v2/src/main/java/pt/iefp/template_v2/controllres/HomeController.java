package pt.iefp.template_v2.controllres;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pt.iefp.template_v2.modelo.Aluno;

import java.util.ArrayList;

@Controller
public class HomeController {
    ArrayList<Aluno> alunos;


    public HomeController() {
        alunos = new ArrayList<>();
        this.alunos.add(new Aluno("Joao", "joao@mail.pt"));
        this.alunos.add(new Aluno("Rita", "rita@mail.pt"));
        this.alunos.add(new Aluno("Carlos", "carlos@mail.pt"));
        this.alunos.add(new Aluno("Luis", "luis@mail.pt"));

    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "if");
        /*
        d - Bom dia
        t - Boa tarde
        n - Boa noite
         */
        model.addAttribute("dia", "t");
        return "index";
    }

    @GetMapping("/switch")
    public String pag_switch(Model model) {
        model.addAttribute("title", "switch");
        /*
        d - Bom dia
        t - Boa tarde
        n - Boa noite
         */
        model.addAttribute("dia", "t");
        return "switch";
    }

    @GetMapping("/for")
    public String pag_for(Model model) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Antonio");

        model.addAttribute("title", "for");
        model.addAttribute("nomes", nomes);

        return "for";
    }


    @GetMapping("/forObj")
    public String pag_forObj(Model model) {

        model.addAttribute("title", "for Obj");
        model.addAttribute("listaAlunos", alunos);

        return "forObj";
    }



    @GetMapping("/pag2")
    public String pagina(Model model) {
        Aluno aluno = new Aluno("", "");

        model.addAttribute("title", "Registo");
        model.addAttribute("aluno", aluno);
        return "pag2";
    }



    /*

        GET     -> ler dados
        POST    -> escrever dados
        PUT     -> atualizar dados
        DELETE  -> apagar dados

     */


    @PostMapping("/addAluno")
    public String addAluno(@ModelAttribute Aluno aluno) {
        this.alunos.add(aluno);

        return "redirect:/forObj";
    }

}
