package j10_ejercicio;

import static java.time.Month.*;

public class NewSwitchExpression {
    public static void main(String[] args) {
        var month = APRIL;
        switch(month) {
            case JANUARY, JUNE, JULY -> System.out.println();
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> System.out.println();
            case MARCH, MAY, APRIL, AUGUST -> System.out.println(" hola :)" + month);
            default -> System.out.println();
        };
    }
}
