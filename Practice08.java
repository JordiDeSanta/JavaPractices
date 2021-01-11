
import java.util.Scanner;

public class Practice08 {
    public static int status;
    public static int subsidy;

    public static void main(String args[]) {
        // ENROLLMENT VALUE
                
        Scanner sc = new Scanner(System.in);
         
        // Ask for number of credits
        System.out.print("Number of credits: ");
        int credits = sc.nextInt();

        // Show credit price
        System.out.print("Credit price: ");
        int creditPrice = sc.nextInt();

        // Ask for student social status
        System.out.print("Student social status: ");
        status = sc.nextInt();

        int finalCost = enrollmentFinalCost(credits, creditPrice);
       
        System.out.println("Final enrollment cost: " + finalCost);
        System.out.println("Subsidy value: " + subsidy);
    }

    public static int enrollmentFinalCost(int numberOfCredits, int creditCost) {
        int enrollmentCost;

        if (numberOfCredits <= 20) {
            enrollmentCost = numberOfCredits * creditCost;
        } 
        else {
            enrollmentCost = (creditCost * 20) + ((numberOfCredits - 20) * creditCost);
        }

        int originalPrice;

        switch(status) {
            case 1: originalPrice = (int) (enrollmentCost - enrollmentCost * 0.8); subsidy = 200000; break;
            case 2: originalPrice = (int) (enrollmentCost - enrollmentCost * 0.5); subsidy = 200000; break;
            case 3: originalPrice = (int) (enrollmentCost - enrollmentCost * 0.3); subsidy = 0; break; 
            default: originalPrice = (int) (enrollmentCost); subsidy = 0; break;
        }

        return originalPrice;
    }
}