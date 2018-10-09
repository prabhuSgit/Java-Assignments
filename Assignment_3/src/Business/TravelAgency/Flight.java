/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelAgency;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabhu Surbamanian
 */
public class Flight {
    private String flightCode;
    private String seats;
    private String fromLocation;
    private String toLocation;
    private String schedule;
    private String airline;
    private ArrayList<Customer> customerDirectory;
    private String seat[][];
    private String status;

    public Flight(){
        customerDirectory = new ArrayList<Customer>();
        seat = new String[][]{{"W1", "M2", "A3"},
                              {"W4", "M5", "A6"},
                              {"W7", "M8", "A9"}};
    /*
        int count = 1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                seat[i][j]=count;
                count++;
            }
        }*/
    }
    
    public void seatDecrease(){
        
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

    public int checkReserve(String input){
        int k = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                //here we check if the seat has already been reserved
                
                if(seat[i][j] == input) {
                    
                    seat[i][j]= "0";
                    return 0;
                }
                //if its not reserved then reserve it
                else{
                    k = 1;
                    continue;
                }
            }
        }
        if(k == 1){
                JOptionPane.showMessageDialog(null, "The seat has already been taken", "Error", JOptionPane.ERROR_MESSAGE);
            }
        return k;
    }

    public String[][] getSeat() {
        return seat;
    }

    public void setSeat(String[][] seat) {
        this.seat = seat;
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

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
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
