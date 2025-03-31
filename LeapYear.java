import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check leap year...");
        int year = sc.nextInt();
        
        // //logic 1
        // if( (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0) ) {
        //     System.out.println(year + " is a Leap Year");
        // }
        // else{
        //     System.out.println(year + " is Not Leap year");
        // }

        // // logic 2
        // if ( (year % 4) != 0) {
        //     System.out.println(year + " is not a leap year.");
        // }
        // else if ( (year % 100 == 0 && year % 400 != 0) ) {
        //     System.out.println(year + " is not a leap year.");
        // }
        // else {
        //     System.out.println(year + " is a leap year.");
        // }

        // logic 3
        if ( (year % 4) == 0) {
            if ( (year % 100) == 0) {
                if ( (year % 400) == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
