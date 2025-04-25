public class ReverseArray {
    public static void reverse(int numbers[]) {
        int start = 0, end = numbers.length-1;
        while (start < end) {
            // swaping the values
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
    //driver code
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        reverse(numbers); // in java arrays are passed by referene so changes in function will effects in main function
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }
}
