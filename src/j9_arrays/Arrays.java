package j9_arrays;

public class Arrays {

    public static void main(String[] args) {
    int[] edades = new int[3];
        edades[0] = 12;
        edades[1] = 15;
        edades[2] = 18;

        for (int i = 0; i < edades.length-2 ; i++) {
            System.out.println("edades["+i+"] = " + edades[i]);
        }
    }
}
