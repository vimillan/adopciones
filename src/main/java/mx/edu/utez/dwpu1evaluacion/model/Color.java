package mx.edu.utez.dwpu1evaluacion.model;

public class Color {
    private Integer id;
    private String nombre;
    
    public Color() {
    }

    public Color(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
