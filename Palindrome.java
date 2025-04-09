import java.util.*;

public class Palindrome {
    public static int isPalindrome(int num) {
        // int givenNum = num;
        int digits = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            digits = (digits * 10) + lastDigit;
            num /= 10;
        }
        return digits;
        // if (digits == givenNum) {
        //     System.out.println(givenNum + " is a palindrome");
        // } else {
        //     System.out.println(givenNum + " is not a palindrome");
        // }
    }
    
    //driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int number = sc.nextInt();
        int digits = isPalindrome(number);
        if (number == digits) {
            System.out.println(digits + " is a palindrome");
        } else {
            System.out.println(digits + " is not a palindrome");
        }
        sc.close();
    }
}
