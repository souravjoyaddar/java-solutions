public class SumOfDigits {
    public static void getSum(int num) {
        int givenNum = num;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        System.out.println("Sum of digits " + givenNum + " is = " + sum);

    }
    //driver code
    public static void main(String[] args) {
        getSum(951);
    }
}
