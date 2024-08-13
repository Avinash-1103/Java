import java.util.Scanner;

// Table of number

public class program7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num * i);
        }
    }
}
