public class Arrays {
    public static int getMax(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];    
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest number of the array is: " + min);
        return max;
    }
    //driver code
    public static void main(String[] args) {
        int numbers[] = {4, 6, 8, 10, 18, 12, 14, 1, 16};

        System.out.println("The largest num of array is: " + getMax(numbers));
        

    }
    
}
