public class SentenciaForEach {
    public static void main(String[] args) {
        
        int[] numeros = {1, 3, 5, 7, 9, 11,13,15};

        int[]numerosNuevos = new int[numeros.length +1];
        for (int i=0;i < numeros.length;i++){
            numerosNuevos[i]= numeros[i];
        }
        numerosNuevos[numerosNuevos.length-1]=40;
        numeros = numerosNuevos;

        for(int num: numeros){
            System.out.println(num);
        }




        /*String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Frank"};

        for(String nombre : nombres){
            if (nombres[7] == "Frank"){
                nombres[7] = "Pedro";
            }
            System.out.println("nombre = " + nombre);
        }*/
    }
}
