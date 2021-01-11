import java.util.Scanner;

public class Practice03 {
    public static void main(String args[]) {
        // ORDINATION OF 3 NUMBERS

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
            System.out.println("Greater is " + a);

            if (b > c) {
                System.out.println("Mid is " + b);
                System.out.println("Less is " + c);
            }
            else {
                System.out.println("Mid is " + c);
                System.out.println("Less is " + b);
            }
         }
         else if (b > a && b > c) {
            System.out.println("Greater is " + b);
            
            if (a > c) {
                System.out.println("Mid is " + a);
                System.out.println("Less is " + c);
            }
            else {
                System.out.println("Mid is " + c);
                System.out.println("Less is " + a);
            }
         }
         else {
            System.out.println("Greater is " + c);

            if (a > b) {
                System.out.println("Mid is " + a);
                System.out.println("Less is " + b);
            }
            else {
                System.out.println("Mid is " + b);
                System.out.println("Less is " + a);
            }
         }
    }

    
}