package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Account;
import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.SavingsAccount;

import java.util.Scanner;

public class MainWithMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while(!answer.equals("E")) {
            answer = mainMenu(scanner);
            switch (answer) {
                case "C":
                    Account account = createAccount(scanner);
                    break;
                case "L":
                    break;
                case "E":
                    System.out.println("about to exit...");
                    break;
                default:
                    System.out.println("unrecognized option, try again");
                    break;
            }
        }
    }

    private static Account createAccount(Scanner in) {
        Account resultAccount;
        System.out.println("Please select what kind of account");
        System.out.println("(S) - savings");
        System.out.println("(I) - investments");

        String answer = in.nextLine();
        System.out.println("type an initial balance");
        String initialBalance = in.nextLine();

        double initialBalanceAsDouble = Double.parseDouble(initialBalance);
        if (answer.equals("S")){
            resultAccount = new SavingsAccount(initialBalanceAsDouble,createCustomer(in));
        }else if (answer.equals("I")){
            resultAccount = new InvestmentAccount(initialBalanceAsDouble, createCustomer(in));
        } else {
            resultAccount = null;
        }
        return resultAccount;
    }

    private static Customer createCustomer(Scanner in){
        System.out.println("type a customer name");
        String customerName = in.nextLine();
        System.out.println("type a customer address");
        String customerAddress = in.nextLine();

        return new Customer(customerName, customerAddress);
    }

    private static String mainMenu(Scanner scanner) {
        System.out.println("Hello user, what do you want to do with your money today?");
        System.out.println("Here are the possible choices:");
        System.out.println("(C) - Create an account");
        System.out.println("(L) - List your accounts");
        System.out.println("(E) - Exit the application");
        return scanner.nextLine();
    }
}
