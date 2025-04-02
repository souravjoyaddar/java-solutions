public class JavaBasics {
    public static void main(String[] args) {
        //optimize approach
        for (int line = 7; line >= 1; line--) {
            for ( int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Optimize approach ends

        // Brut force approach starts
        // int n = 5;
        // for (int line = 1; line <= n; line++) {
        //     for (int star = 1; star <= n-line+1; star++) {
        //         System.out.println("*");
        //     }
        // }

    }
}


