package fr.epita.bank.services;

import fr.epita.bank.datamodel.SavingsAccount;

public class AccountService {

    public void withDraw(SavingsAccount account, double amount) {
        double finalBalance = account.getBalance() - amount;
        if (finalBalance < 0) {
            System.out.println("not able to complete, balance would be negative");
        } else {
            account.setBalance(finalBalance);
        }
    }

    public double calculateInstantInterests(SavingsAccount account) {
       return account.getInterestRate() * account.getBalance();
    }
}
