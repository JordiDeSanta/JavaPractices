import java.util.Scanner;

public class Practice04 {
    public static void main(String args[]) {
        // IS MULTIPLE OF

        Scanner sc = new Scanner(System.in);

        // Ask for first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
    
        // Ask for second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        boolean aIsMultiple = b % a == 0;
        boolean bIsMultiple = a % b == 0;

        int multipleForA = a / b;
        int multipleForB = b / a;

        if (aIsMultiple) {
            System.out.println(a + " is multiple of " + b + " because " + a + " multiplied by " + multipleForB + " is " + b);
        }
        else if (bIsMultiple) {
            System.out.println(b + " is multiple of " + a + " because " + b + " multiplied by " + multipleForA +" is " + a);
        }
        else {
            System.out.println("Hasn´t multiples");
        }
    }
}