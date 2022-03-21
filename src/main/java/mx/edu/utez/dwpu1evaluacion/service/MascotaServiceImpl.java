package mx.edu.utez.dwpu1evaluacion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import mx.edu.utez.dwpu1evaluacion.model.Caracter;
import mx.edu.utez.dwpu1evaluacion.model.Color;
import mx.edu.utez.dwpu1evaluacion.model.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService {
    List<Mascota> lista = null;

    public MascotaServiceImpl() {
        lista = new ArrayList<>();

        lista.add(new Mascota("Milka", 3, "Chihuahua de pelaje naranja cobrizo", "Perro", false, "milka.jpg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Canelita", 1, "Chihuahua de pelaje café", "Perro", true, "canelita.jpg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Michotito", 2, "Pelaje naranja con rayas blancas", "Gato", true, "gato1.png", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Masapan", 1, "Pelaje grisaseo y ojos amrillos", "Gato", true, "gato2.jpg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Horchato", 2, "Pelaje gris con blanco, ojos azules", "Gato", true, "gato3.jpg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Salem", 1, "Completamente negro", "Gato", false, "salem.jpg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Mushpit", 5, "Husky gris", "Perro", true, "husky.jpg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
        lista.add(new Mascota("Bodoque", 2, "Salquicha", "Perro", true, "salchicha.jpeg", new Caracter(1, "Activo"), new Color(1, "Blanco")));
    }

    @Override
    public List<Mascota> listarTodas() {
        return lista;
    }

    @Override
    public void guardar(Mascota mascota) {
        lista.add(mascota);
    }

    @Override
    public List<Mascota> filtrarTipoMascota(String tipoMascota) {
        return lista.stream().filter(mascota -> mascota.getTipoMascota().equals(tipoMascota))
                .collect(Collectors.toList());
    }

    @Override
    public List<Mascota> filtrarMascotaDisponible(String tipoMascota, boolean disponible) {
        return lista.stream()
                .filter(mascota -> mascota.isDisponibleAdopcion()
                        && mascota.getTipoMascota().equals(tipoMascota))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> listarImagenes() {
        List<String> imagenes = new ArrayList<>();
        for (Mascota m : lista) {
            imagenes.add(m.getImagen());
        }
        return imagenes;
    }

}
