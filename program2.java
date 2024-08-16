import java.util.Scanner;

// Addition of two numbers

public class program2 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")

        Scanner scanner = new Scanner ( System.in );
        System.out.print("Enter first Number :");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("output : " + sum);
    }
}
