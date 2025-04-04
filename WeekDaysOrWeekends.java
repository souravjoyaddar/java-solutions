import java.util.*;

public class WeekDaysOrWeekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int dayNumber = sc.nextInt();
        sc.close();
        
        switch (dayNumber) {
            case 1, 2, 3, 4, 5: {System.out.println("Weekday"); break;}
            case 6, 7: {System.out.println("Weekend"); break;}
            default: {System.out.println("Invalid Day");}
        }
    }
}
