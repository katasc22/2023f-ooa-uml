package fr.epita.bank.datamodel;

public class Account {

    private Customer customer;
    private double balance;

    public Account(double initialBalanceAsDouble, Customer customer) {
        this.balance = initialBalanceAsDouble;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
