import java.util.*;

public class Solutions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int number = sc.nextInt();
        sc.close();

        if (number > 0) {
            System.out.println("It's a positive number.");
        }
        else if (number == 0) {
            System.out.println(number + " is a non-negative integer.");
        }
        else {
            System.out.println("It's a negative number.");
        }
    }
}