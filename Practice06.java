import java.util.Scanner;

public class Practice06 {
    public static void main(String args[]) {
        // WORKERS NOMINE
        Scanner sc = new Scanner(System.in);

        // Ask for input info
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter hours to work: ");
        int hours = sc.nextInt();

        System.out.print("Enter hour price: ");
        int price = sc.nextInt();

        System.out.print("Minimum monthly salary: ");
        int minimum = sc.nextInt();

        // Process
        int salary = hours * price;

        if(salary > minimum) {
            System.out.println("Nombre: " + name);
            System.out.println("Montly salary: " + salary);
        }
        else {
            System.out.println("Nombre: " + name);
        };
    }
}