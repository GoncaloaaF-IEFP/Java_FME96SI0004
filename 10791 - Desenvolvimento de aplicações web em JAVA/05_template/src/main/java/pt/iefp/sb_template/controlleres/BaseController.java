package pt.iefp.sb_template.controlleres;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {


    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/infos")
    public String infos() {
        return "info";
    }


}
