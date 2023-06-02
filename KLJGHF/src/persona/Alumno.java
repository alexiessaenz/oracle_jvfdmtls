package persona;

public class Alumno {
    private String nombre;
    private Double nota;
    private String correo;

    public Alumno() {
    }

    public Alumno(String nombre, Double nota, String correo) {
        this.nombre = nombre;
        this.nota = nota;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}

class TestAlumnos{
    public static void main(String[] args) {
        TestAlumnos ts = new TestAlumnos();

        Alumno[] alumnos = new Alumno[3];

        alumnos[0] = new Alumno("Andres",4.2,"addada@mail.com");
        alumnos[1] = new Alumno("Ricky",6.6,"rer@mail.com");
        alumnos[2] = new Alumno("Dan",7.9,"adafdfda@mail.com");


    }

    public
}
