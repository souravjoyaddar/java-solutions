//Binomial Coefficient
public class BinoCoeffi {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact; //always return outside the loop or you will get an error.
    }

    public static int binoCoeffi(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNminusR = factorial(n - r);
        return factN / (factR * factNminusR);
        
    }

    public static void main(String[] args) {                                
        System.out.println(binoCoeffi(5, 2));  
    }
}

