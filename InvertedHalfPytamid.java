public class InvertedHalfPytamid {
    public static void main(String[] args) {
        for (int line = 5; line >= 1; line--) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
