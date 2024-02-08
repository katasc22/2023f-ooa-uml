package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Account;
import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingsAccount;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a customer name");
        String customerName = scanner.nextLine();
        System.out.println("type a customer address");
        String customerAddress = scanner.nextLine();
        System.out.println("type an initial balance");
        String initialBalance = scanner.nextLine();
        double initialBalanceAsDouble = Double.parseDouble(initialBalance);

        Customer customer = new Customer(customerName, customerAddress);

        SavingsAccount account = new SavingsAccount(initialBalanceAsDouble, customer);






        // To test if an account is of a specific type
        // List<Account> accounts;
        // boolean isSavingAccount = accounts.get(0) instanceof SavingsAccount;



    }
}
