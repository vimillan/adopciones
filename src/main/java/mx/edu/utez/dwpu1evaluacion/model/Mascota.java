package mx.edu.utez.dwpu1evaluacion.model;

public class Mascota {
    private String nombre;
    private int edad;
    private String descripcion;
    private String tipoMascota;
    private boolean disponibleAdopcion;
    private String imagen;
    
    public Mascota() {
    }

    public Mascota(String nombre, int edad, String descripcion, String tipoMascota, boolean disponibleAdopcion,
            String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.descripcion = descripcion;
        this.tipoMascota = tipoMascota;
        this.disponibleAdopcion = disponibleAdopcion;
        this.imagen = imagen;
    }
    

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTipoMascota() {
        return tipoMascota;
    }
    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }
    public boolean isDisponibleAdopcion() {
        return disponibleAdopcion;
    }
    public void setDisponibleAdopcion(boolean disponibleAdopcion) {
        this.disponibleAdopcion = disponibleAdopcion;
    }
  
}
