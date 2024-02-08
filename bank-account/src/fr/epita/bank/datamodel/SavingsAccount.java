package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initialBalanceAsDouble, Customer customer) {
        super(initialBalanceAsDouble, customer);
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0){
            return;
        }
        this.interestRate = interestRate;
    }


    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                " " + super.toString() + '}';
    }


}
