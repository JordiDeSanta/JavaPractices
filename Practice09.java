import java.util.Scanner;

public class Practice09 {
    public static void main(String args[]) {
        // DELIVERY VALUE
                
        Scanner sc = new Scanner(System.in);
         
        // Ask for weight
        System.out.print("Weight: ");
        int weight = sc.nextInt();

        // Ask for price
        System.out.print("Price: ");
        int price = sc.nextInt();

        // Ask for the day
        System.out.print("Is monday (Y)es or (N)ot: ");
        String monday = sc.next();

        System.out.print("Pay method (E)fectivo or (C)ard: ");
        String pay = sc.next();

        int delivery = calculateDelivery(weight, price, monday, pay);
        int Price = calculateDiscount(price, delivery);
        int finalPrice = calculatePromotion(Price, pay, monday, price);

        // Print results
        System.out.println("Delivery: " + finalPrice);
    }

    public static int calculateDelivery(int productsWeight, int priceOf, String day, String payMethod) {
        // DELIVERY
        int deliveryPrice;

        if(productsWeight > 200) {
            if((productsWeight - 200)%10 == 0) {
                deliveryPrice = 35000 + (((productsWeight - 200)/10) * 2000);
            }
            else {
                deliveryPrice = 35000;
            }
        }
        else if(productsWeight <= 200 && productsWeight > 150) {
            deliveryPrice = 30000;
        }
        else if(productsWeight <= 150 && productsWeight > 100) {
            deliveryPrice = 25000;
        }
        else {
            deliveryPrice = 20000;
        }
        
        return deliveryPrice;
    }

    public static int calculateDiscount(int priceOf, int deliveryPrice) {
        if(priceOf > 1000000) {
            deliveryPrice -= deliveryPrice * 0.3;
        }
        else if (priceOf > 600000 && priceOf <= 1000000) {
            deliveryPrice -= deliveryPrice * 0.2;
        }
        else if (priceOf >= 300000 && priceOf <= 600000) {
            deliveryPrice -= deliveryPrice * 0.1;
        }

        return deliveryPrice;
    }

    public static int calculatePromotion(int deliveryPrice, String payMethod, String isMonday, int priceOf) {
        if(isMonday == "Y" && payMethod == "C") {
            deliveryPrice -= deliveryPrice * 0.5;
        }
        else if(payMethod == "E" && priceOf > 1000000) {
            deliveryPrice -= deliveryPrice * 0.6;
        }

        return deliveryPrice;
    }
}