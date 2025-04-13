public class Patterns {
    public static void hollowRectngle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                } 
            }
            System.out.println(); 
        }
    }

    public static void invertedRoatedHalfPyramiid(int n) {
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    // System.out.print(" ");
                }
                System.out.println();
            }
        }
        
    public static void pyramidWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //approach 1
    public static void invertedPyramidWithNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //aproach 2
    public static void invrPyraWithNum2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //floydsTrangle
    public static void floydsTrangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRectngle(3, 4);
        // invertedRoatedHalfPyramiid(5);
        // invertedPyramidWithNumbers(6);
        // pyramidWithNumbers(5);
        // invrPyraWithNum2(5);
        floydsTrangle(5);

    }
}
