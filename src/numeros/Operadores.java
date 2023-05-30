package numeros;

import static java.lang.Math.pow;

public class Operadores {
    double res = (-3);
    double res2 = pow(5,2);
    double res3 = (7%2);
    public void print(){
        System.out.println("Resultado : " + (res + res2 + res3));
    }

    public double calcularIva(int i){
        double iva = i*1.13;
        return iva;
    }
}
