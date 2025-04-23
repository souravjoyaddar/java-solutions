public class BinarySearch {
    public static int binarySearch(int numbers[], int target) {
        int start = 0, end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
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
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 20;
        int index = binarySearch(numbers, target);
        if (index == -1) {
            System.out.println("Target NOT Found.");
        } else {
            System.out.println("Target is found at index: " + index);
        }
    }
}
