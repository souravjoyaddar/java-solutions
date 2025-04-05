import java.util.*;

public class SumCalculator {
    public static int calculateSum(int num1, int num2) {  // num1 & num2 is the parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // a & b is the arguments or actual parameters
        System.out.println("Sum is " + sum);
        sc.close();
    }

}

