import java.util.*;

//program of largest , second largest and third largest number in array 

public class array9 {
    public static void main(String[] args) {
        int[] array = {12, 45, 7, 90, 7, 34, 89, 23, 1, 56, 89, 78, 45, 90, 21};

        //sorting
        Arrays.sort(array);

        //array to set
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }

        //set to array
        Integer[] Array2 = uniqueSet.toArray(new Integer[0]);

        // largest
        Integer largest = Array2[Array2.length - 1];

        // second largest
        Integer secondLargest = Array2[Array2.length - 2];

        // third largest 
        Integer thirdlargest = Array2[Array2.length - 3];

        System.out.println("Largest number : " + largest);
        System.out.println("Second largest number : " + secondLargest);
        System.out.println("Third largest number : " + thirdlargest);
    }
}
