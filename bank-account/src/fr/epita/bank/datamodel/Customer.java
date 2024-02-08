package fr.epita.bank.datamodel;

public class Customer {
    private String name;
    private String address;

    public Customer(String customerName, String customerAddress) {
        this.name = customerName;
        this.address = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
