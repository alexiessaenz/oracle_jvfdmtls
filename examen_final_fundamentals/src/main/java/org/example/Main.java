package org.example;

import org.example.datos.*;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];

        Empleado asalariado = new EmpAsalariado("234242-23", "pedro", "gomez", 200.0);
        Empleado porhoras = new EmpPorHora("234242-23", "anibal", "vasquez", 20, 1.8, 3.6);
        Empleado comision = new EmpComision("234242-23", "osiel", "galdamez", 20, 2.5);
        Empleado asalComision = new EmpAsalariadoComision("234242-23", "luis", "suarez", 200.0, 20, 2.5);

        empleados[0] = asalariado;
        empleados[1] = porhoras;
        empleados[2] = comision;
        empleados[3] = asalComision;

        for (Empleado empleado : empleados) {

            System.out.println(" =============== " + empleado.getClass().getSimpleName() + " =============== ");
            System.out.println("DNI:" + empleado.getDNI());
            System.out.println("Nombre:" + empleado.getNombre());
            System.out.println("Apellido:" + empleado.getApellido());

            if(empleado instanceof EmpPorHora){
                System.out.println("Horas trabjadas:" + ((EmpPorHora) empleado).getHorasTrabajadas());
                System.out.println("Valor hora normal:" + ((EmpPorHora) empleado).getValorHoraNormal());
                System.out.println("Valor hora extra:" + ((EmpPorHora) empleado).getValorHoraExtra());
            }

            if (empleado instanceof EmpComision) {
                System.out.println("Total ventas:" + ((EmpComision) empleado).getTotalVentas());
                System.out.println("Porcentaje de comision:" + ((EmpComision) empleado).getPorcentajComision());

            }

            if(empleado instanceof EmpAsalariado){
                System.out.println("Salario semanal:" + ((EmpAsalariado) empleado).getSalarioSemanal());
                if (empleado instanceof EmpAsalariadoComision) {
                    System.out.println("Total ventas:" + ((EmpAsalariadoComision) empleado).getTotalVentas());
                    System.out.println("Porcentaje de comision:" + ((EmpAsalariadoComision) empleado).getPorcentajComision());

                }
            }

        }

    }
}