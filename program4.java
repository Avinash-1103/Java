import java.util.Scanner;

// find greater number between 2 

public class program4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = scanner.nextInt();

        @SuppressWarnings("resource")
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second Number : ");
        int num2 = scanner2.nextInt();

        if (num1 > num2) {
            System.out.println("First Number is greater than Second Number");
        } else if (num1 < num2) {
            System.out.println("Second Number is greater than First Number");
        } else {
            System.out.println("Both Numbers are Equal");
        }
    }
}
