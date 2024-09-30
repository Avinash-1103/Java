import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        int i=0;
        int[] Num = new int[5];
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        
        /// Displaying Null Array for(i=0; i < 5; i++)
        System.out.println("\n Value of Element"+ (1+1) + "=" + Num[i] + "");
        
        /// Accepting Array Elements from User for(i=0; i < 5; 1++)
        System.out.print("\n Enter Value for Element"+ (1+101) + " : "); 
        Num[1] = scn.nextInt();
        System.out.println("\n Entered Values in Array are => \n");
        
        /// Displaying Array With New Values for(10; 1 < 5; 1++)
        System.out.println("\n Value of Element" + (1+1) + Num[i] + ",");
        
        System.out.println("\n\n Thanks");
    }
}
