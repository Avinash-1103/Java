import java.util.Scanner;

// Addition of two numbers

public class program2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int num1 = scanner.nextInt();

        @SuppressWarnings("resource")
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Second Number : ");
        int num2 = scanner2.nextInt();
        int sum = num1 + num2;
        System.out.println("output : " + sum);
    }
}
