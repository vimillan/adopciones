package mx.edu.utez.dwpu1evaluacion.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.edu.utez.dwpu1evaluacion.model.Usuario;

@Controller
public class HomeController {
    private String usuarioSesion;

    @GetMapping("/")
    public String index() {
        return "userForm";
    }

    @GetMapping("/inicio")
    public String inicio(Model model, Usuario usuario) {
        model.addAttribute("tipoUsuario", usuarioSesion);
        return "index";
    }

    @PostMapping("/iniciarSesion")
    public String iniciarSesion(@RequestParam("tipoUsuario") String tipoUsuario, Usuario usuario, Model model) {
        usuarioSesion = tipoUsuario;
        model.addAttribute("tipoUsuario", usuarioSesion);
        return "index";
    }

    @PostMapping("/registrar")
    public String reguistrarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result,
            Model model) {
        model.addAttribute("usuario", usuario);
        if (result.hasErrors()) {
            for (ObjectError error : result.getAllErrors()) {
                System.out.println("Error: " + error.getDefaultMessage());
            }
            return "index";
        }
        return "confirmContacto";
    }

}
