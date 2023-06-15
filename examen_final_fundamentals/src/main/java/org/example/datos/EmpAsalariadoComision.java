package org.example.datos;

public class EmpAsalariadoComision extends EmpAsalariado{
    private double totalVentas;
    private double porcentajComision;

    public EmpAsalariadoComision() {
        super();
    }

    public EmpAsalariadoComision(String DNI, String nombre, String apellido, Double salarioSemanal, double totalVentas, double porcentajComision) {
        super(DNI, nombre, apellido, salarioSemanal);
        this.totalVentas = totalVentas;
        this.porcentajComision = porcentajComision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getPorcentajComision() {
        return porcentajComision;
    }

    public void setPorcentajComision(double porcentajComision) {
        this.porcentajComision = porcentajComision;
    }

    @Override
    public String toString() {
        return "EmpAsalariadoComision{" +
                "totalVentas=" + totalVentas +
                ", porcentajComision=" + porcentajComision +
                ", DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
