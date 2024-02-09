package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Account;
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
                    Account account = createAccount();
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
        if (answer.equals("S")){
            resultAccount = new SavingsAccount();
        }else if (answer.equals("I")){
            resultAccount = new InvestmentAccount();
        } else {
            resultAccount = null;
        }
        return resultAccount;


    }

    private static String mainMenu(Scanner scanner) {
        System.out.println("Hello user, what do you want to do with your money today?");
        System.out.println("Here are the possible choices:");
        System.out.println("(C) - Create an account");
        System.out.println("(L) - List your accounts");
        System.out.println("(E) - Exit the application");
        String answer = scanner.nextLine();
        return answer;
    }
}
