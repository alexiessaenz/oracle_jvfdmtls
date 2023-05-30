package j5_ExamenPrimeraSemana;
import javax.swing.*;
public class Examen {
    public static void main(String[] args) {
        int level = Integer.parseInt(JOptionPane.showInputDialog("Medida actual del tanque: "));
        tanuqe(level);
    }
    static void tanuqe(int level) {
        if (level == 70) imp("Tanque lleno",level);
        else if (level >= 60 && level < 70) imp("Tanque casi lleno",level);
        else if (level >= 40 && level < 60) imp("Tanque 3/4",level);
        else if (level >= 35 && level < 40) imp("Medio tanque",level);
        else if (level >= 20 && level < 35) imp("Sufiente", level);
        else if (level >= 1  && level < 20) imp("Insuficiente",level);
        else imp("Error ingrese un dato 1 - 70");
    }
   static void imp(String str, int level){
       JOptionPane.showMessageDialog(null,str,"Su nivel es " + level,JOptionPane.INFORMATION_MESSAGE);
   }
    static void imp(String str){
        JOptionPane.showMessageDialog(null,str,"information " ,JOptionPane.INFORMATION_MESSAGE);
    }
}