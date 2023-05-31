package j9_arrays;

public class WithForEach {


    public static void main(String[] args) {
        int[] num = {1,3,5,7,11,13,17};
        for (int n : num) {
            //System.out.println("num = " + n);
           if( n == num[num.length-1])
               num[num.length-1] = 100;
            System.out.println("num = " + num[num.length-1]);
        }



    }

}
