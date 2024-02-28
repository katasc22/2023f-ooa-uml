package fr.epita.patients.datamodel;

import java.time.LocalDate;

public class Patient {

    private String patientNr;
    private String lastname;
    private String firstname;
    private String address;
    private String tel;
    private String insuranceID;
    private LocalDate subscriptionDate;

    public Patient(String patientNr, String lastname, String firstname, String address, String tel, String insuranceID, LocalDate subscriptionDate) {
        this.patientNr = patientNr;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.tel = tel;
        this.insuranceID = insuranceID;
        this.subscriptionDate = subscriptionDate;
    }

    public String getPatientNr() {
        return patientNr;
    }

    public void setPatientNr(String patientNr) {
        this.patientNr = patientNr;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDate subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientNr='" + patientNr + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", insuranceID='" + insuranceID + '\'' +
                ", subscriptionDate=" + subscriptionDate +
                '}';
    }
}
