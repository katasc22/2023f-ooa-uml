package fr.epita.bank.datamodel;

public class Account {

    private Customer customer;
    private double balance;

    public Account(double initialBalanceAsDouble, Customer customer) {
        this.balance = initialBalanceAsDouble;
        this.customer = customer;
    }
}
