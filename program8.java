import java.util.*;

// days of week in switch case

public class program8 {
    public static void main(String [] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();

        switch ( num ) {
            case 1 :
                System.out.print("Monday");
                break;
            
            case 2 :
                System.out.print("Tuesday");
                break;
                
            case 3 :
                System.out.print("Wednesday");
                break;

            case 4 :
                System.out.print("Thursday");
                break;

            case 5 :
                System.out.print("Friday");
                break;

            case 6 :
                System.out.print("Saturday");
                break;

            case 7 :
                System.out.print("Sunday");
                break;

            default :
                System.out.print("Wrong input");
                break;    
        }
    }
}