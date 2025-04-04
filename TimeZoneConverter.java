import java.util.*;

public class TimeZoneConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        hour += 5;
        minute += 30;

        if (minute >= 60) {
            hour++;
            minute -= 60;    
        }
        if (hour >= 24) {
            day++;
            hour -= 24;
        }
        
        System.out.println("day: " + day + ", hour: " + hour + ", munute: " + minute);
    }
}
