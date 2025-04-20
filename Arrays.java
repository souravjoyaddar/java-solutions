import java.util.*;
public class Arrays {
    //arrays in java are passed by refenance, which menans the modifications inside function will effect the main function
    public static void update(int marks[], int notChanged) {
        notChanged = 10;
        for (int i=0; i<marks.length; i++) {
            marks[i] += 1;
        }

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int marks[] = {88, 92, 95};
        int notChanged = 5;
        update(marks, notChanged);
        System.out.println("Unchanged valu: " +notChanged);
        //indecis with incrimented value by 1 using update() function
        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
    
}
