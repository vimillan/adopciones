package mx.edu.utez.dwpu1evaluacion.service;

import java.util.List;

import mx.edu.utez.dwpu1evaluacion.model.Caracter;

public interface CaracterService {
    List<Caracter> listarTodos();
    Caracter buscarPorId(int id);
}
