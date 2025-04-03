import java.util.*;

public class Calculator {
    public static void main(String argr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Operation you want to perform (+, -, *, / or %)");
        char c = sc.next().charAt(0);
        sc.close();

        switch (c) {
            case '+': System.out.println(a + " + " + b + " is = " + (a + b));
                break;
            case '-': System.out.println(a + " - " + b + " is = " + (a - b));
                break;
            case '*': System.out.println(a + " * " + b + " is = " + (a * b));
                break;
            case '/': System.out.println(a + " / " + b + " is = " + (a / b));
                break;
            case '%': System.out.println(a + " % " + b + " is = " + (a % b));
                break;
        
            default: System.out.println("You entered the wrong operator!");
        }
    }
}
