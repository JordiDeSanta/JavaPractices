import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SpecialAndroidPractice {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        // Put the ships in random places and comprobate
        int RandX = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        int RandY = ThreadLocalRandom.current().nextInt(0, 5 + 1);

        // Hack
        // System.out.println((RandX + 1) + " " + (RandY + 1));

        // Ask to the user
        System.out.println("X axis (1-6): ");
        int xuser = sc.nextInt();
        System.out.println("Y axis (1-6): ");
        int yuser = sc.nextInt();

        // Give the result
        if(RandX == xuser - 1 && RandY == yuser - 1) {
            System.out.println("Good Shoot");
        }
        else{
            System.out.println("You failed");
        }
    }
}
