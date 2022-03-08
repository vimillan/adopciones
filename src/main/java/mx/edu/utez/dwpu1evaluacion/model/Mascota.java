package mx.edu.utez.dwpu1evaluacion.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Mascota {

    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotNull(message = "Edad requerida")
    @Min(0)
    private int edad;

    @NotBlank(message = "La descripción es requerida")
    @Size(min = 2, message = "Mínimo 2 caracteres")
    @Size(max = 50, message = "Máximo 50 caracteres")
    private String descripcion;

    @NotBlank(message = "El tipo es requerido")
    private String tipoMascota;

    @NotNull(message = "Disponibilidad requerida")
    private boolean disponibleAdopcion;

    @NotBlank(message = "La imagen es requerida")
    private String imagen;

    @NotNull(message = "La fecha es requerida")
    private Date fechaRegistro;
    
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

    public Mascota(String nombre, int edad, String descripcion, String tipoMascota, boolean disponibleAdopcion,
            String imagen, Date fechaRegistro) {
        this.nombre = nombre;
        this.edad = edad;
        this.descripcion = descripcion;
        this.tipoMascota = tipoMascota;
        this.disponibleAdopcion = disponibleAdopcion;
        this.imagen = imagen;
        this.fechaRegistro = fechaRegistro;
    }

    

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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
