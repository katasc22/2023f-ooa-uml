package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initialBalanceAsDouble, Customer customer) {
        super(initialBalanceAsDouble, customer);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                " " + super.toString() + '}';
    }
}
