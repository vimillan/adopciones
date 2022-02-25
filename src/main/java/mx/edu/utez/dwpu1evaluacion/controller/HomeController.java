package mx.edu.utez.dwpu1evaluacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/nuevaMascota")
    public String nuevaMascota() {
        return "mascotaForm";
    }

    @GetMapping("/inicio")
    public String inicio(Model model) {
        model.addAttribute("tipoUsuario", usuarioSesion);
        return "index";
    }

    @PostMapping("/iniciarSesion")
    public String iniciarSesion(@RequestParam ("tipoUsuario") String tipoUsuario,  Model model) {
        usuarioSesion = tipoUsuario;
        model.addAttribute("tipoUsuario", usuarioSesion);
        return "index";
    }
   
    @PostMapping("/registrar")
    public String reguistrarUsuario(@RequestParam ("nombre") String nombre,
            @RequestParam("telefono") String telefono, @RequestParam("apellidos") String apellidos,
            @RequestParam("correo") String correo, Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellidos(apellidos);
        usuario.setTelefono(telefono);
        usuario.setCorreo(correo);
        
        model.addAttribute("usuario", usuario);
        return "confirmContacto";
    }
    
}
