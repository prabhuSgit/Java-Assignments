/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

/**
 *
 * @author Prabhu Surbamanian
 */
public class Person {
    
    Demographic demographic = new Demographic();
    Address address = new Address();
    Bank savingsAccount = new Bank();
    Bank checkingAccount = new Bank();
    DriverLicense driverLicense = new DriverLicense();
    MedicalRecord medicalRecord = new MedicalRecord();

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Bank getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(Bank savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public Bank getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(Bank checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
        
    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }
        
}