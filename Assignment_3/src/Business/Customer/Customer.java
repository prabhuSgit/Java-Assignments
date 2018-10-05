/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author Prabhu Surbamanian
 */
public class Customer {
    private String customerName;
    private Integer customerAge;
    private String airline;
    private String flightCode;
    private String fromLocation;
    private String toLocation;
    private String seat;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    @Override
    public String toString() {
        return this.getCustomerName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
