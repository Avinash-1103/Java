import java.util.*;

// reverse table

public class program10 {
    public static void main(String [] args) {

        @SuppressWarnings("resource")

        Scanner scanner = new Scanner ( System.in );
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        for ( int i = 10 ; i > 0 ; i-- ) 
            System.out.println( i * num );
    }
}
