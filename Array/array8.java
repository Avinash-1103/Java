import java.util.*;

// program of largest , second largest and third largest number in array

public class array8 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 90, 7, 34, 89, 23, 1, 56, 89, 78, 45, 90, 21};

        Arrays.sort(arr);

        int FMax, SMax = 0, TMax = 0 , size = arr.length-1;

        //First maximum 
        FMax = arr[arr.length-1];
        
        //second maximum
        while(FMax == arr[size]){
            size--;
            SMax = arr[size];
        }
        
        //third maximum
        while (arr[size] == SMax) {
            size--; 
            TMax = arr[size];
        }
  
        System.out.println("First maximum : " + FMax);
        System.out.println("Second maximum : " + SMax);
        System.out.println("Third maximum : " + TMax);

    }
}
