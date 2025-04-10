//this program is written to practice different built in Math functions in java

public class MathFunction {
    public static void main(String[] args) {
        //Math.abs() returns the absulate (positive) value of the same number
        System.out.println(Math.abs(-4.7));  //result is = 4.7
        System.out.println(Math.abs(-5.23)); //result is = 5.23
        System.out.println(Math.abs(3.0));   //result is = 3.0

        // Math.max() returns the maximum of 2 numbers
        System.out.println(Math.max(34, 50)); // result is = 50

        // Math.min() returns the minimum of 2 numbers
        System.out.println(Math.min(34, 50)); // result is 34

        // Math.pow() returns the value of a to the power b
        System.out.println(Math.pow(2, 5)); // result is = 32

        // Math.sqrt() returns square root of a given number
        System.out.println(Math.sqrt(49));  // result is = 7
    }
}
