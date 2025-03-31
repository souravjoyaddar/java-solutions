import java.util.*;

public class JavaBasics {
    public static void main(String argr[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // n = 123
        //int reversed = 0;
        
        while (number > 0) { //true
            int lastDigit = number % 10; // to get the last digit
            System.out.print(lastDigit);
            // reversed = ( (reversed * 10) + lastDigit); // to append the extracted digits
            number /= 10;    //to remove the last digit
             
        }
        // System.out.println(reversed);
        sc.close();
    }
}
