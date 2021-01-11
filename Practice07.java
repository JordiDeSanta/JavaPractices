import java.util.Scanner;

public class Practice07 {
    public static void main(String args[]) {
        // DISCOUNT
        Scanner sc = new Scanner(System.in);
         
        // Ask for input number
        System.out.print("Number of shampoos: ");
        int units = sc.nextInt();

        int Price = 5000;

       int finalPrice = priceWithDiscount(units, Price);
       System.out.print("Price with discount: " + finalPrice);
    }

    public static int priceWithDiscount(int quantity, int price) {

        // Quantity of discounts
        boolean twentyPercent = quantity >= 5 && quantity < 10;
        boolean fourthyPercent = quantity >= 10;

        int dcnt;

        if (fourthyPercent) {
            dcnt = (int) (price * 0.4);
            
        }
        else if(twentyPercent) {
            dcnt = (int) (price * 0.2);
        }
        else {
            dcnt = (int) (price * 0.1);
        }

        return (price - dcnt) * quantity;
    }
}