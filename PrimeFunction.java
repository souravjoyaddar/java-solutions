//prime number
public class PrimeFunction {
    //function to calculate prime number
    // public static boolean checkPrime(int n) {
    //     //corner case for n <= 1
    //     if (n <= 1) { 
    //         return false;
    //     } 
    //     for ( int i = 2; i <= n-1; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }    
    //     }
    //     return true;
    // }

    //optimize approach to calculate prime number
    public static boolean checkPrime(int n) {
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
    
    public static void main(String[] args) {                                
        System.out.println(checkPrime(2));
    } 
} 
