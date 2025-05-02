public class SubArrays {
    public static void printSubArrays(int[] numbers) {
        int ts = 0;
        for (int i=0; i<numbers.length; i++) {
            // int start = i;
            for (int j=i; j<numbers.length;j++) {
                // int end = j;
                for (int k=i; k<=j; k++) {
                    System.out.print(numbers[k]+" ");
                    //sum of sub arrays
                    // find max and min of that sub array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays is: " +ts);
    }
    //driver code
    public static void main(String[] args) {
        int[] numbers ={2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
