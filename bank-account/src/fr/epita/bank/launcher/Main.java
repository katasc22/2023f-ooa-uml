package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a customer name");
        String customerName = scanner.nextLine();
        System.out.println("type a customer address");
        String customerAddress = scanner.nextLine();

        Customer customer = new Customer(customerName, customerAddress);



    }
}
