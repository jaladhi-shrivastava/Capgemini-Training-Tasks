package InterestCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");

            choice = sc.nextInt();
             try {
                 switch (choice) {
                     case 1:
                         // SB Account
                         System.out.println("Enter the Average amount in your account:");
                         double SBAmount = sc.nextDouble();

                         System.out.println("Enter the type of account:");
                         String accountType = sc.next().trim();

                         SBAccount sb = new SBAccount(SBAmount, accountType);
                         System.out.println("Interest gained: Rs. " + sb.calculateInterest());
                         break;

                     case 2:
                         // FD Account
                         System.out.println("Enter the FD amount:");
                         double FDAmount = sc.nextDouble();

                         System.out.println("Enter the number of days:");
                         int noOfDays = sc.nextInt();

                         System.out.println("Enter your age:");
                         int ageOfACHolder = sc.nextInt();

                         FDAccount fd = new FDAccount(FDAmount, noOfDays, ageOfACHolder);
                         System.out.println("Interest gained is: " + fd.calculateInterest());
                         break;

                     case 3:
                         // RD Account
                         System.out.println("Enter the monthly amount:");
                         double monthlyAmount = sc.nextDouble();

                         System.out.println("Enter number of months:");
                         int noOfMonths = sc.nextInt();

                         System.out.println("Enter your age:");
                         int ageACHolder = sc.nextInt();

                         RDAccount rd = new RDAccount(noOfMonths, monthlyAmount, ageACHolder);
                         System.out.println("Interest gained is: " + rd.calculateInterest());
                         break;

                     case 4:
                         System.out.println("Exiting...");
                         break;

                     default:
                         System.out.println("Invalid option.");
                 }
             }
             catch (InvalidValueException e) {
                 System.out.println(e.getMessage());

             } catch (Exception e) {
                 System.out.println("Unexpected error occurred.");
             }
        }
        while (choice != 4);
        sc.close();
    }
}
