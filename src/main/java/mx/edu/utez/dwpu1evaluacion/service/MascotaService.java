package mx.edu.utez.dwpu1evaluacion.service;

import java.util.List;

import mx.edu.utez.dwpu1evaluacion.model.Mascota;

public interface MascotaService {
    List<Mascota> listarTodas();

    void guardar(Mascota mascota);

    List<Mascota> filtrarTipoMascota(String tipoMascota);

    List<Mascota> filtrarMascotaDisponible(String tipoMascota, boolean disponible);

    List<String> listarImagenes();
}