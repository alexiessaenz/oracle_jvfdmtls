import j9_arrays.Persona;
import numeros.Operadores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("kenia");
        p.setApellido("murillo");
        p.setDireccion("apulo, ilopango, sansalvador");
        System.out.println(p.toString());;
        System.out.println("==========================");
        System.out.println(p.getNombre()+p.getApellido()+ p.getDireccion());


//        Main main = new Main();
//        //main.func();
//        Operadores op = new Operadores();
//        op.print();

    }

    public void func(){
        int a=3, b=2;
        int resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
    }

}