package classes;

public class routeclass {

    public int routeNumber;
    public float iPercentageOfCommission1;
    public float iPercentageOfCommission2;
    public float iPercentageOfCommission3;
    public int numberOfPassengers;
    public int aditionalPassengerValue;

    public routeclass(int number, float percentageOfCommission1, float percentageOfCommission2, float percentageOfCommission3, int passengers, int aditionalPassengerPrice) {

        routeNumber = number;
        iPercentageOfCommission1 = percentageOfCommission1;
        iPercentageOfCommission2 = percentageOfCommission2;
        iPercentageOfCommission3 = percentageOfCommission3;
        numberOfPassengers = passengers;
        aditionalPassengerValue = aditionalPassengerPrice;   

    }

    public float calculatePrice() {
        
        switch (routeNumber) {
            case 1:
                return 500000;   
            case 2:
                return 600000;
            case 3:
                return 800000;
            case 4:
                return 1000000;  
            default:
                return 0;
        }

    }

    public float calculateCommisionPercentage() {

        // Passengers
        // 50 max
        if (numberOfPassengers <= 50) {
            return 0;
        }
        // 50 - 100
        else if(numberOfPassengers > 50 && numberOfPassengers <= 100) {
            return iPercentageOfCommission1;
        }
        // 100 - 150
        else if(numberOfPassengers > 100 && numberOfPassengers <= 150) {
            return iPercentageOfCommission2;
        }
        // 150 - 200
        else if(numberOfPassengers > 150) {
            return iPercentageOfCommission3;
        }

        return 0;
    }

    public float aditionalPay() {

        float extraPassengersPay = (numberOfPassengers - 200) * aditionalPassengerValue;

        return extraPassengersPay;

    }

    public float driverPay()
    {
        float percentage = calculateCommisionPercentage() / 100;
        float basePay = calculatePrice() * percentage;
        float finalPay = basePay + aditionalPay();

        return finalPay;
    }
}
