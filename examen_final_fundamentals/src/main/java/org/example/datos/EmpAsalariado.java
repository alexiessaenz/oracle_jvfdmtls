package org.example.datos;

public class EmpAsalariado extends Empleado{
    private Double salarioSemanal;

    public EmpAsalariado() {
        super();
    }

    public EmpAsalariado(String DNI, String nombre, String apellido, Double salarioSemanal) {
        super(DNI, nombre, apellido);
        this.salarioSemanal = salarioSemanal;
    }

    public Double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(Double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }


}
