package mx.edu.utez.dwpu1evaluacion.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.edu.utez.dwpu1evaluacion.model.Mascota;
import mx.edu.utez.dwpu1evaluacion.service.MascotaServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaServiceImpl mascotaService;

    @GetMapping(value = { "/lista", "/lista/{tipoMascota}", "/lista/{tipoMascota}/{disponible}" })
    public String listarMascota(@PathVariable(required = false) String tipoMascota,
            @PathVariable(required = false) String disponible, Model model) {

        List<Mascota> listaMascota = mascotaService.listarTodas();
        List<Mascota> resultado = new ArrayList<>();

        if (tipoMascota != null) {

            resultado = listaMascota.stream().filter(mascota -> mascota.getTipoMascota().equals(tipoMascota))
                    .collect(Collectors.toList());
            model.addAttribute("tipo", tipoMascota);
            model.addAttribute("mascotas", resultado);
            model.addAttribute("filtro", false);
        } else {
            model.addAttribute("filtro", false);
            model.addAttribute("mascotas", listaMascota);
        }

        if (disponible != null) {
            boolean disp = Boolean.parseBoolean(disponible);
            if (disp) {
                resultado = listaMascota.stream()
                        .filter(mascota -> mascota.isDisponibleAdopcion()
                                && mascota.getTipoMascota().equals(tipoMascota))
                        .collect(Collectors.toList());
            }
            model.addAttribute("filtro", disp);
            model.addAttribute("mascotas", resultado);
        }

        return "listMascotas";
    }

    @GetMapping("/detalles/{nombre}")
    public String verDetalles(@PathVariable String nombre, Model model) {
        Mascota mascota = new Mascota();
        List<Mascota> listaMascota = mascotaService.listarTodas();

        for (Mascota m : listaMascota) {
            if (m.getNombre().equals(nombre)) {
                mascota = m;
            }
        }
        model.addAttribute("mascota", mascota);
        return "detailMascota";
    }

    @PostMapping("/save")
    public String guardarMascota(Mascota mascota, Model model) {
        mascotaService.guardar(mascota);
        List<Mascota> listaMascota = mascotaService.listarTodas();
        model.addAttribute("mascotas", listaMascota);
        return "listMascotas";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

}
