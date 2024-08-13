import java.util.Scanner;

// take number input and print days of week

public class program5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednseday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else if (num == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong Input");
        }
    }
}
