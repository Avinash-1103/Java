import java.util.*;

// Prime number

class program11 {
    static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scanner.nextInt();

        if (isPrime(num))
            System.out.println("It's a prime number");
        else
            System.out.println("It's not prime number");
    }
}

