package org.example.datos;

public class EmpPorHora extends Empleado{
    private int horasTrabajadas;
    private double valorHoraNormal;
    private double valorHoraExtra;

    public EmpPorHora() {
        super();
    }

    public EmpPorHora(String DNI, String nombre, String apellido, int horasTrabajadas, double valorHoraNormal, double valorHoraExtra) {
        super(DNI, nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraNormal = valorHoraNormal;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public void setValorHoraNormal(double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public String toString() {
        return "EmpPorHora{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHoraNormal=" + valorHoraNormal +
                ", valorHoraExtra=" + valorHoraExtra +
                ", DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
