/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelAgency;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Prabhu Surbamanian
 */
public class UserDirectory {
    private ArrayList<Customer> userDirectory;
    
    public UserDirectory(){
        userDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<Customer> userDirectory) {
        this.userDirectory = userDirectory;
    }
    
    public Customer addUser(){
        Customer newUser = new Customer();
        userDirectory.add(newUser);
        return newUser;
    }
    
    public void deleteUser(Customer user){
        userDirectory.remove(user);
    }
    
    public Customer searchUser(String name){
        for(Customer user : this.userDirectory){
            if(user.getFlightCode().equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    }
}
