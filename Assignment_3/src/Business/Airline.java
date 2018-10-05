/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Prabhu Surbamanian
 */
public class Airline {
    private String name;
    private Integer code;
    private String description;
    private ArrayList<Flight> flightDirectory;

    public Airline(){
        flightDirectory = new ArrayList<Flight>();
    }
    
    public ArrayList<Flight> getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(ArrayList<Flight> flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Flight addFlight(){
        Flight newFlight = new Flight();
        flightDirectory.add(newFlight);
        return newFlight;
    }
     public void deleteFlight(Flight flight){
        flightDirectory.remove(flight);
    }
    
    public Flight searchFlight(String name){
        for(Flight flight : this.flightDirectory){
            if(flight.getFlightCode().equalsIgnoreCase(name)){
                return flight;
            }
        }
        return null;
    }
    
}
