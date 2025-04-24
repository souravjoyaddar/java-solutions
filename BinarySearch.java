public class BinarySearch {
    public static int binarySearch(int numbers[], int target) {
        int start = 0, end = numbers.length -1;
        while (start <= end) {
            //calculating the mid
            // int mid = start + ((end - start) / 2); //for bigger int
            int mid = (start + end) / 2;

            //comperision
            if (numbers[mid] == target) {
                return mid;
            }
            else if (numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    //driver code
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        int index = binarySearch(numbers, target);
        if (index == -1) {
            System.out.println("Index NOT found.");
        } else {
            System.out.println(numbers[index] + " is found at index " + index);
        }
    }
}