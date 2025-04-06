public class PrimeInRange {
    //function to calc prime number
    public static boolean checkPrime (int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //function to print prime range
    public static void primesInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) { // if the value of i returns as true
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    //driver code
    public static void main(String[] args) {
        primesInRange(20);
    }
}
