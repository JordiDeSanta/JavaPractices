import java.util.Scanner;

public class Practice01 {
    public static void main(String args[]) {
        // PAIR OR ODD NUMBER

        Scanner sc = new Scanner(System.in);
         
        // Ask for input number
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean isPair = number%2 == 0;

        if(isPair) {
            System.out.print("The number " + number + ", is pair");
        }
        else {
            System.out.print("The number " + number + ", is odd");
        }
    }
}