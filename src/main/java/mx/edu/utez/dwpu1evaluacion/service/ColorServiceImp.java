package mx.edu.utez.dwpu1evaluacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.utez.dwpu1evaluacion.model.Color;

@Service
public class ColorServiceImp implements ColorService{
    private List <Color> lista = null;

    public ColorServiceImp() {
        lista = new ArrayList<>();
        lista.add(new Color(1, "Blanco"));
        lista.add(new Color(2, "Café"));
        lista.add(new Color(3, "Gris"));
        lista.add(new Color(4, "Negro"));
        lista.add(new Color(5, "Atigrado"));
        lista.add(new Color(6, "Bicolor"));
        lista.add(new Color(7, "Con manchas"));
        lista.add(new Color(8, "Varios colares"));
    }

    @Override
    public List<Color> listarTodos() {
        return lista;
    }

    @Override
    public Color buscarPorId(int id) {
        Color color = new Color();
        for (Color c : lista) {
            if (c.getId() == id) {
                color = c;
            }
        }
        return color;
    }
    
}
