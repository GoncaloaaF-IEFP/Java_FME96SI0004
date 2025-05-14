package pt.iefp.intro_spring_v2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/pag2", name = "pagina2")
    public String pagina2() {
        return "pag2";
    }


}
