package ejercicio;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        OperadoresAritmeticos op = new OperadoresAritmeticos();
        op.calcular();
    }
    public void calcular(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la super calculadora hp prime!");
        System.out.println("Ingrese una funcion:\n" +
                        " 1. Sumar\n" +
                        " 2. Restar\n" +
                        " 3. Multiplicar\n" +
                        " 4. Dividir\n" +
                        " 5. Salir\n");

        int opt = sc.nextInt();
        double res=0 ;

    if (opt!=5) {
        System.out.println("Ingrese el numero 1: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el numero 2: ");
        int b = sc.nextInt();
        sc.nextLine();

        switch (opt) {
            case 1:
                res = sumar(a, b);
                break;
            case 2:
                res = restar(a, b);
                break;
            case 3:
                res = multiplicar(a, b);
                break;
            case 4:
                res = dividir(a, b);
                break;
        }
        System.out.println("El reultado de la operacion es: " + res);
    }
    }

    public int sumar(int a, int b){
        return a+b;
    }
    public int restar(int a, int b){
        return a-b;
    }
    public int multiplicar(int a, int b){
        return a*b;
    }
    public double dividir(int a, int b){
        return a/b;
    }

}
