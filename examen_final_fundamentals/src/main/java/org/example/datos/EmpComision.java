package org.example.datos;

public class EmpComision extends Empleado{
    private double totalVentas;
    private double porcentajComision;

    public EmpComision() {
        super();
    }

    public EmpComision(String DNI, String nombre, String apellido, double totalVentas, double porcentajComision) {
        super(DNI, nombre, apellido);
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
        return "EmpComision{" +
                "totalVentas=" + totalVentas +
                ", porcentajComision=" + porcentajComision +
                ", DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
