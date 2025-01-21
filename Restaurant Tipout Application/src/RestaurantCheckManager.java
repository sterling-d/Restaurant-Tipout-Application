import java.util.Scanner;

public class RestaurantCheckManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String managerSelection;
        int checkCount = 0;
        double totalSales = 0;
        double totalTips = 0;
        double previousSales = 0;
        double previousTips = 0;

        do {

            System.out.print("Enter total sale amount: ");
            double saleAmount = in.nextDouble();
            // Adds the total sale amount from a customer's check, to existing sales for the day.
            totalSales += saleAmount;
            // previousSales allows us to display the total sales for the day at the end of the loop.
            previousSales = totalSales;

            System.out.print("Enter tip amount: ");
            double tipAmount = in.nextDouble();
            totalTips += tipAmount;
            previousTips = totalTips;

            System.out.print("Enter total final amount: ");
            double finalAmount = in.nextDouble();

            // checkCount++ will allow us to count the total number of checks accrued throughout day.

            checkCount++;
            System.out.println("Check count: " + checkCount);

            System.out.println("Total sale so far: " + totalSales);
            System.out.println("Total pooled tip so far: " + totalTips);

            System.out.print("Do you want to continue? (y/n) ");
            managerSelection = in.next();

            // If the user enters anything other than "y" after this prompt, the scanner will close.

        } while (managerSelection.equalsIgnoreCase("y"));

        // Close the scanner if user enters no
        in.close();

//         Tip allocation for employees:
//         Servers receive 50% tips
//         Chef receives 10% tips, sous-chef & kitchen aid will get 5% each
//         Busser receives 20% tips & hostess receives 10%

        double chefTips = (previousTips * 0.20) * 0.50;
        double sousAidTips = (previousTips * 0.20) * 0.25;
        double serversPresent = (previousTips * 0.50) * 0.50;
        double server3 = (previousTips * 0.50) * 0;


        System.out.println("Tip allocation for $" + previousTips + " in tips.");
        System.out.println("Servers: $" + String.format("%.2f", (previousTips * 0.50)));
        System.out.println("           Server 1: $" + String.format ("%.2f", (serversPresent)));
        System.out.println("           Server 2: $" + String.format ("%.2f", (serversPresent)));
        System.out.println("           Server 3: $" + (server3) + "     (did not work)");
        System.out.println("Kitchen: $" + String.format("%.2f", (previousTips * 0.20)));
        System.out.println("           Chef: $" + String.format ("%.2f", (chefTips)));
        System.out.println("           Sous-Chef: $" + String.format ("%.2f", (sousAidTips)));
        System.out.println("           Kitchen Aid: $" + String.format ("%.2f", (sousAidTips)));


        System.out.println("Host / Hostess: $" + String.format("%.2f", (previousTips * 0.10)));
        System.out.println("Busser: $" + String.format("%.2f", (previousTips * 0.20)));


    }

    }











