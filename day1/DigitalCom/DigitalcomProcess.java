package DigitalCom;

import java.util.Scanner;

public class DigitalcomProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User userRegistration = new User();
        GameService gameService = new GameService();

        boolean is_Game = true;

        while (is_Game) {

            System.out.println("\n1. Register User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice in number: ");

            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.print("Enter user id: ");
                    String rid = sc.next();

                    System.out.print("Enter password: ");
                    String rpwd = sc.next();

                    userRegistration.addUser(rid, rpwd);
                    System.out.println("Registered Successfully");
                    break;

                case 2:
                    System.out.print("Enter user id: ");
                    String lid = sc.next();

                    System.out.print("Enter password: ");
                    String lpwd = sc.next();

                    if (userRegistration.IsAuthenticated(lid, lpwd)) {

                        System.out.println("Logged in Successfully");

                        boolean isLoggedin = true;

                        while (isLoggedin) {

                            System.out.println("\n1. View Games");
                            System.out.println("2. Search by Name");
                            System.out.println("3. Logout");
                            System.out.print("Enter choice: ");

                            int choice = sc.nextInt();

                            switch (choice) {

                                case 1:
                                    gameService.viewAll()
                                            .forEach(System.out::println);
                                    break;

                                case 2:
                                    System.out.print("Enter author name: ");
                                    String author = sc.next();
                                    System.out.println(
                                            gameService.authorSearch(author));
                                    break;

                                case 3:
                                    isLoggedin = false;
                                    System.out.println("Logged out.");
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                            }
                        }

                    } else {
                        System.out.println("Invalid User. Please register first.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    is_Game = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}