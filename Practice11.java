import classes.routeclass;
import java.util.Scanner;

public class Practice11 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Route 1, 2, 3 or 4: ");
        int routeAsk = sc.nextInt();

        System.out.println("Enter the passengers: ");
        int passengersAsk = sc.nextInt();

        // Setting the routes
        routeclass routeOne = new routeclass(1, 5, 6, 7, passengersAsk, 50);
        routeclass routeTwo = new routeclass(2, 7, 8, 9, passengersAsk, 60);
        routeclass routeThree = new routeclass(3, 10, 13, 15, passengersAsk, 100);
        routeclass routeFour = new routeclass(4, 12.5f, 15, 17, passengersAsk, 150);

        float i = 0;

        switch (routeAsk) {
            case 1:
                i = routeOne.driverPay();
            case 2:
                i = routeTwo.driverPay();
            case 3:
                i = routeThree.driverPay();
            case 4:
                i = routeFour.driverPay();  
        }


        System.out.println("The final pay of the driver is: $" + i);
    };

    
}






