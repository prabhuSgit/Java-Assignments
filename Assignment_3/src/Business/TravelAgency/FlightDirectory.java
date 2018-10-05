/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelAgency;

import java.util.ArrayList;

/**
 *
 * @author Prabhu Surbamanian
 */
public class FlightDirectory {
    private ArrayList<Flight> flightDirectory;
    
    public FlightDirectory(){
        flightDirectory = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(ArrayList<Flight> flightDirectory) {
        this.flightDirectory = flightDirectory;
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
