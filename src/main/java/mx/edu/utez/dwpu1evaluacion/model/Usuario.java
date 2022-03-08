package mx.edu.utez.dwpu1evaluacion.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Usuario {
    
    @NotBlank(message = "El nombre es requerido")
    @Pattern(regexp = "[a-zA-Z]+", message = "Debe contener al menos una letra")
    private String nombre;

    @NotBlank(message = "Apellidos requeridos")
    private String apellidos;

    @NotBlank(message = "El teléfono es requerido")
    @Pattern(regexp = "[0-9]+", message = "Debe contener sólo números")
    private String telefono;

    @NotBlank(message = "El correo es requerido")
    private String correo;
    
    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String telefono, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
