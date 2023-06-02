public class SentenciaFor {
    public static void main(String[] args) {

        int numPares=0; //variables globales
        int numImpares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero Par = " + i);
                numPares++; // variable locales
            } else {
                numImpares++;
            }

       }
        System.out.println("Los numeros pares son" +numPares);
        System.out.println("Los numeros impares son" +numImpares);

    }
}
