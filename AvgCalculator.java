public class AvgCalculator {

    public static int getAvg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    
    }

    public static void main(String[] args) {
        int result = getAvg(25, 10, 100);
        System.out.println("The average of 3 numbers is = " + result);
    }
}
