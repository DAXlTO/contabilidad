package tech.aldane.contabilidad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/registrarse")
    public String registrarse(){
        return "register";
    }
}
