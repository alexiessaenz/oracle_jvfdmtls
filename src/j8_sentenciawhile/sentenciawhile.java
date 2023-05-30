package j8_sentenciawhile;

public class sentenciawhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5 ) {

            System.out.println("i is " + i);
            i++;
        }
        boolean prueba = true;
        do{
            if (i == 10){
                prueba = false;
            }
            System.out.println("i is "+i++);
        } while (prueba);
    }
}
