package mx.edu.utez.dwpu1evaluacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.utez.dwpu1evaluacion.model.Caracter;

@Service
public class CarcterServiceImp  implements CaracterService{
    private List <Caracter> lista = null;

    
    public CarcterServiceImp() {
        lista = new ArrayList<>();
        lista.add(new Caracter(1, "Activo"));
        lista.add(new Caracter(2, "Independiente"));
        lista.add(new Caracter(3, "Juguetón"));
        lista.add(new Caracter(4, "Protector"));
        lista.add(new Caracter(5, "Ruidoso"));
        lista.add(new Caracter(6, "Tímido"));
        lista.add(new Caracter(7, "Tranquilo"));
        lista.add(new Caracter(8, "Amoroso"));
    }

    @Override
    public List<Caracter> listarTodos() {
        return lista;
    }

    @Override
    public Caracter buscarPorId(int id) {
        Caracter caracter = new Caracter();
        for (Caracter c : lista) {
            if (c.getId() == id) {
                caracter = c;
            }
        }
        return caracter;
    }
}
