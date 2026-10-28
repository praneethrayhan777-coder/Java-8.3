package src;

import java.util.Scanner;

class TC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Bill Amount: ");
            double bill = sc.nextDouble();

            System.out.print("Enter Tip Percentage: ");
            double percentage = sc.nextDouble();

            if (bill < 0 || percentage < 0) {
                System.out.println("Error: Enter positive values.");
            } else {
                double tip = bill * percentage / 100;

                System.out.printf("Tip Amount: $%.2f%n", tip);
            }

        } catch (Exception e) {
            System.out.println(
                    "Error: Invalid input. Please enter numbers.");
        }

        System.out.print("Reset? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("All fields cleared.");
        }

        sc.close();
    }
}
