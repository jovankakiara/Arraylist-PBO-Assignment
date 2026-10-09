import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    private static void printHeader(String title) {
        System.out.println("=========================================");
        System.out.printf("   %-36s \n", title);
        System.out.println("=========================================");
    }

    private static void printDivider() {
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        bank.addCustomer("Kiara", "Septi");
        Customer currentCustomer = bank.getCustomer(0);
        currentCustomer.addAccount(new Account(500.0));
        Account account = currentCustomer.getAccount(0);

        boolean running = true;

        System.out.println("\n*****************************************");
        System.out.println("*      WELCOME TO GLOBAL SMART ATM      *");
        System.out.println("*****************************************");

        while (running) {
            System.out.println("\n+---------------------------------------+");
            System.out.printf("| Account Holder : %-20s |\n", 
                currentCustomer.getFirstName() + " " + currentCustomer.getLastName());
            System.out.println("+---------------------------------------+");
            System.out.println("| [1] Check Account Balance             |");
            System.out.println("| [2] Deposit Funds                     |");
            System.out.println("| [3] Withdraw Funds                    |");
            System.out.println("| [4] Exit / Return Card                |");
            System.out.println("+---------------------------------------+");
            System.out.print(">> Select Menu Option (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n[!] Invalid input format. Please enter a number.");
                scanner.next(); 
                continue;
            }

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    printHeader("BALANCE ENQUIRY");
                    System.out.printf(" Available Balance : $%.2f\n", account.getBalance());
                    printDivider();
                    break;

                case 2:
                    printHeader("DEPOSIT TRANSACTION");
                    System.out.print(" Enter deposit amount: $");
                    double dep = scanner.nextDouble();
                    
                    System.out.print(" Processing transaction...");
                    if (account.deposit(dep)) {
                        System.out.println("\n [SUCCESS] Transaction completed!");
                        System.out.printf(" New Balance : $%.2f\n", account.getBalance());
                    } else {
                        System.out.println("\n [FAILED] Invalid deposit amount. Operation canceled.");
                    }
                    printDivider();
                    break;

                case 3:
                    printHeader("WITHDRAWAL TRANSACTION");
                    System.out.print(" Enter withdrawal amount: $");
                    double wd = scanner.nextDouble();

                    System.out.print(" Dispensing cash...");
                    if (account.withdraw(wd)) {
                        System.out.println("\n [SUCCESS] Please take your cash.");
                        System.out.printf(" Remaining Balance : $%.2f\n", account.getBalance());
                    } else {
                        System.out.println("\n [FAILED] Insufficient funds or invalid amount.");
                    }
                    printDivider();
                    break;

                case 4:
                    printHeader("SESSION TERMINATED");
                    System.out.println(" Thank you for banking with us!");
                    System.out.println(" Please remember to take your card.");
                    printDivider();
                    running = false;
                    break;

                default:
                    System.out.println("[!] Option not recognized. Please choose between 1-4.");
            }
        }
    }
}