import java.util.Scanner;

public class Practice05 {
    public static void main(String args[]) {
        // LEAP YEAR
        Scanner sc = new Scanner(System.in);
         
        // Ask for input number
        System.out.print("Enter year: ");
        int year = sc.nextInt();


        if (isLeap(year)) {
            System.out.print(year + " is leap");
        } 
        else {
            System.out.print(year + " isn´t leap");
        }
        
    }

    public static boolean isLeap(int a) {
        if (a%4 == 0 && !(a%100 == 0)) {
            return true;
        } 
        else if (a%100 == 0 && a%400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}