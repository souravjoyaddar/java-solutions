import java.util.*;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        if (number <= 1) {
            System.out.println(number + " is not prime");
        } else {
                //for (int i = 2; i < number; i++) {
                for (int i = 2; i <= Math.sqrt(number); i ++) {
                if ( number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
    }
}
