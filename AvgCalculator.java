import java.util.*;
public class AvgCalculator {

    public static int getAvg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number to calculate the average: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result = getAvg(num1, num2, num3);
        System.out.println("The average of 3 numbers is = " + result);
        sc.close();
    }
}
