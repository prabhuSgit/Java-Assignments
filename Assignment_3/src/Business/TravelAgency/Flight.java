/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelAgency;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author Prabhu Surbamanian
 */
public class Flight {
    private String flightCode;
    private Integer seats = 5;
    private String fromLocation;
    private String toLocation;
    private String schedule;
    private String airline;
    private ArrayList<Customer> customerDirectory;
    private String status;

    public Flight(){
        customerDirectory = new ArrayList<Customer>();
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Customer addCustomer(){
        Customer newCustomer = new Customer();
        customerDirectory.add(newCustomer);
        return newCustomer;
    }
     public void deleteCustomer(Flight flight){
        customerDirectory.remove(flight);
    }
    
    public Customer searchCustomer(String name){
        for(Customer customer : this.customerDirectory){
            if(customer.getFlightCode().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }
    
    @Override
    public String toString() {
        return this.getFlightCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
