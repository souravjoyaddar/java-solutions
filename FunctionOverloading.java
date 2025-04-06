public class FunctionOverloading {
    //function overloading - to write the same function having different parameters 

    //function to calculate sum of 2 nums
    // public static int getSum(int a, int b) {
    //     return a + b;
    // }
    // //function to calc sum of 3 nums
    // public static int getSum(int a, int b, int c) {
    //     return a + b + c;
    // }
    
    //function to calculate int sum
    public static int sum(int a, int b) {
        return a + b;
    }
    //function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {                                
        System.out.println(sum(6, 10));
        System.out.println(sum(5.5f, 2.5f));
    } 
}

