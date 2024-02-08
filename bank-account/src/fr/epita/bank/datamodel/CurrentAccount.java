package fr.epita.bank.datamodel;

public class CurrentAccount  {

    Account account;

    public CurrentAccount(double initialBalance, Customer customer){
        this.account = new Account(initialBalance, customer);
    }

}
