package fr.epita.bank.datamodel;

public class Account {

    protected Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected double balance;

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
