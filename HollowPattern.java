public class HollowPattern {
    public static void hollowRectngle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {  // outer loop controls the rows 
            for (int j = 1; j <= cols; j++) {  //inner loop controls the columns
                if (i == 1 || i == rows || j == 1 || j == cols) { // this condition decides what to print
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectngle(5, 6);
    }
}
