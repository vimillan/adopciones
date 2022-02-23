package mx.edu.utez.dwpu1evaluacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.utez.dwpu1evaluacion.model.Mascota;

@Service
public class MascotaServiceImpl implements MascotaService {
    List<Mascota> lista = null;

    public MascotaServiceImpl() {
        lista = new ArrayList<>();

        lista.add(new Mascota("Milka", 3, "Chihuahua de pelaje naranja cobrizo", "Perro", false, "milka.jpg"));
        lista.add(new Mascota("Canelita", 1, "Chihuahua de pelaje café", "Perro", true, "canelita.jpg"));
        lista.add(new Mascota("Michotito", 2, "Pelaje naranja con rayas blancas", "Gato", true, "gato1.png"));
        lista.add(new Mascota("Masapan", 1, "Pelaje grisaseo y ojos amrillos", "Gato", true, "gato2.jpg"));
        lista.add(new Mascota("Horchato", 2, "Pelaje gris con blanco, ojos azules", "Gato", true, "gato3.jpg"));
        lista.add(new Mascota("Salem", 1, "Completamente negro", "Gato", false, "salem.jpg"));
        lista.add(new Mascota("Mushpit", 5, "Husky gris", "Perro", true, "husky.jpg"));
        lista.add(new Mascota("Bodoque", 2, "Salquicha", "Perro", true, "salchicha.jpeg"));
    }

    @Override
    public List<Mascota> listarTodas() {
        return lista;
    }

}