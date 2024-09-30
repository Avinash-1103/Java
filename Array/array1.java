// array program 

public class array1 {
    public static void main(String[] args) {
        int[] example = { 10, 20, 30, 40, 50 };

        System.out.println("Array length :  " + example.length );

        for (int i = 0; i <= example.length ; i++) 
        {
            System.out.println("Index of Element " + i + ": "+ example[i]);
        }
    }
}
