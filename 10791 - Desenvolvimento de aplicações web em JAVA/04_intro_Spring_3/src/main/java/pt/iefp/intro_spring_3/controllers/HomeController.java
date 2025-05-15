package pt.iefp.intro_spring_3.controllers;

/*
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nome", "Gonçalo");
        return "index";
    }

    @GetMapping("/pag2")
    public String pag2() {
        return "pag2";
    }

}

*/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/pag2")
    public String pagina2() {
        return "pag2";
    }


}

