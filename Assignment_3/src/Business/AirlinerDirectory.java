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
public class AirlinerDirectory {
    
    private ArrayList<Airline> airlineDiroctory;
    
    public AirlinerDirectory(){
        airlineDiroctory = new ArrayList<Airline>();
    }
    
    public ArrayList<Airline> getAirlinerDiroctory() {
        return airlineDiroctory;
    }

    public void setAirlinerDiroctory(ArrayList<Airline> airlinerDiroctory) {
        this.airlineDiroctory = airlineDiroctory;
    }
    
    public Airline addAirline(){
        Airline newAirline = new Airline();
        airlineDiroctory.add(newAirline);
        return newAirline;
    }
    
    public void deleteAirline(Airline airline){
        airlineDiroctory.remove(airline);
    }
    
    public Airline searchAccount(String name){
        for(Airline airline : this.airlineDiroctory){
            if(airline.getName().equalsIgnoreCase(name)){
                return airline;
            }
        }
        return null;
    }

}
