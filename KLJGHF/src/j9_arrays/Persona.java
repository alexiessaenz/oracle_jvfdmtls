package j9_arrays;

public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona:\n" +
                "\nnombre='" + nombre + '\'' +
                ", \napellido='" + apellido + '\'' +
                ", \ndireccion='" + direccion + '\'' +
                ' ';
    }
}
