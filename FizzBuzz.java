import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check FizzBuzz: ");
        int number = sc.nextInt();
        sc.close();

        if ( (number % 15 == 0) ) {
            System.out.println("It's FizzBuzz");
        }
        else if ( (number % 3 == 0) ) {
            System.out.println("It's Fizz");
        }
        else if ( (number % 5 == 0) ) {
            System.out.println("It's Buzz");
        } else {
            System.out.println(number + " is not FizzBuzz, try again.");
        }
    }  
}
