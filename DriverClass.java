import java.util.*;

public class DriverClass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO FLY CAB SERVICES !!");

        System.out.println("Enter Your Name :");
        String name = sc.nextLine();

        System.out.println("Select your Cab:");
        System.out.println("1. MiniCab");
        System.out.println("2. Sedan Cab");
        System.out.println("3. Luxury Cab");

        int choice = sc.nextInt();

        Cab selectedCab = null;

        switch (choice) {

            case 1:
                selectedCab = new MiniCab();
                break;

            case 2:
                selectedCab = new SedanCab();
                break;

            case 3:
                selectedCab = new LuxuryCab();
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        System.out.println("Enter the distance :");
        double distance = sc.nextDouble();

        double totalPrice =
            Helper.CalcFare(distance, selectedCab.getPrice());

        Helper.PrintThanks(
            name,
            selectedCab.getType(),
            totalPrice
        );

        sc.close();
    }
}