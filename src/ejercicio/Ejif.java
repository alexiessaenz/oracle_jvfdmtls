package ejercicio;

import javax.swing.*;

public class Ejif {
    public static void main(String[] args) {
        float promedio =Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: ")) ;

        if(promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio>=6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println(promedio >= 4.0);
        } else {
            System.out.println("Reprobado!");
        }


        System.out.println("Su promedio es: "+promedio);
        JOptionPane.showMessageDialog(
                null,
                promedio + " pts",
                "Su promedio es ",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
