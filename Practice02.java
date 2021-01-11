import java.util.Scanner;

public class Practice02 {
    public static void main(String args[]) {
        // GREATER NUMBER

        Scanner sc = new Scanner(System.in);

        // Ask for first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Ask for second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

         // Ask for third number
         System.out.print("Enter third number: ");
         int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print(a + " is greater");
        }
        else if (b > a && b > c) {
            System.out.print(b + " is greater");
        }
        else {
            System.out.print(c + " is greater");
        }
        
    }
}