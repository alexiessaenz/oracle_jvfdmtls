package j7_sentenciafor;

public class sentenciafor {

    public static void main(String[] args) {
        int numPares = 0;
        int numImpares = 0;

        for (int i = 1; i <= 100 ; i++){
            if(i % 2 == 0){
                System.out.println("NUMERO PAR = "+i);
                numPares++;
            } else {
                numImpares++;
            }
        }

        System.out.println("Los numeros pares son:");
        System.out.println("Los numeros impares son:");
    }
}
