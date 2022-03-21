package mx.edu.utez.dwpu1evaluacion.service;

import java.util.List;

import mx.edu.utez.dwpu1evaluacion.model.Color;

public interface ColorService {
    List<Color> listarTodos();
    Color buscarPorId(int id);
}
