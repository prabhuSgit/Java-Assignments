/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import java.awt.Choice;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Prabhu Surbamanian
 */

public class Console {
   
    public static int choice(){
        int input; 
        Scanner choice = new Scanner(System.in);
        input = choice.nextInt();
        return input;
    }
     
    public static void main (String arg[]){
        
        Product product = new Product();
        int i = 1;
        label:
            while (i > 0){
            System.out.println(""
                + "Choose your options:\n"
                + "1. Create the product\n"
                + "2. View the product\n"
                + "3. Update the product\n"
                + "4. *Exit*\n"
                + "Enter your option>");
            int input1 = choice();
            
            switch(input1){
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter Product name:");
                    String prodName = scanner.nextLine();
                    product.setName(prodName);
                    
                    try{
                        System.out.println("Enter Product price:");
                        Integer prodPrice = scanner.nextInt();
                        product.setPrice(prodPrice);
                        }
                    catch(InputMismatchException e){
                        System.out.println("Sorry! Numbers only");
                        continue label;
                        }
                    
                    try{
                    System.out.println("Enter Product availability number:");
                    Integer prodAvailNbr = scanner.nextInt();
                    product.setAvailNum(prodAvailNbr);
                    }
                    catch(InputMismatchException e){
                        System.out.println("Sorry! Numbers only");
                        continue label;
                    }
                    
                    System.out.println("Enter Product description");
                    String prodDescription = scanner.nextLine();
                    product.setDescription(prodDescription);
        
                    System.out.println("Enter Product Supplier name");
                    String supplierName = scanner.nextLine();
                    product.getSupplier().setSupplierName(supplierName);
                    
                    try{
                    System.out.println("Enter Product Supplier number");
                    Integer supplierNbr = scanner.nextInt();
                    product.getSupplier().setSupplierRegNbr(supplierNbr);
                    }
                    catch(InputMismatchException e){
                        System.out.println("Sorry! Numbers only");
                        continue label;
                    }
                    
                    System.out.println("Enter Product Supplier description");
                    String supplierDesc = scanner.nextLine();
                    product.getSupplier().setSupplierDescription(supplierDesc);
                
                    break;
                
                case 2:
                
                    System.out.println(""
                            +          "Displaying the details you entered");
                    System.out.println("Product Name: " + product.getName());
                    System.out.println("Product Price: " + product.getPrice());
                    System.out.println("Product Availability Number: " + product.getAvailNum());
                    System.out.println("Product Description: " + product.getDescription());
                    System.out.println("Product Supplier Name:" + product.getSupplier().getSupplierName());
                    System.out.println("Product Supplier Registeration number: " + product.getSupplier().getSupplierRegNbr());
                    System.out.println("Product Supplier Description: " + product.getSupplier().getSupplierDescription());
                
                    break;
                    
                case 3:
                    int x = 1;
                    while (x>0){
                        Scanner scanner3 = new Scanner(System.in);
                        System.out.println(""
                                + "Choose the field you want to update:\n"
                                + "1-> Product Name\n"
                                + "2-> Product Price\n"
                                + "3-> Product Availability Number\n"
                                + "4-> Product Description\n"
                                + "5-> Product Supplier Name\n"
                                + "6-> Product Supplier Registeration number\n"
                                + "7-> Product Supplier Description\n"
                                + "8-> *Exit*\n");
                        int input2 = choice();
                    
                        switch(input2){
                            case 1:
                                System.out.println("Product Name: " + product.getName() + 
                                                   "\nChange to: ");
                                String prodNameNew = scanner3.nextLine();
                                product.setName(prodNameNew);
                                
                                System.out.println("New Name: " + product.getName());
                                break;
                            case 2:
                                try{
                                System.out.println("\nProduct Price: " + product.getPrice() + 
                                                   "\nChange to: ");
                                Integer prodPriceNew = scanner3.nextInt();
                                product.setPrice(prodPriceNew);
                                }
                                catch(InputMismatchException e){
                                System.out.println("Sorry! Numbers only");
                                continue label;
                                }
                                System.out.println("New Price: " + product.getPrice());
                                break;
                            case 3:
                                try{
                                System.out.println("\nProduct Availabilty number: " + product.getAvailNum() + 
                                                   "\nChange to: ");
                                Integer prodAvailNbrNew = scanner3.nextInt();
                                product.setAvailNum(prodAvailNbrNew);
                                }
                                catch(InputMismatchException e){
                                System.out.println("Sorry! Numbers only");
                                continue label;
                                }
                                System.out.println("New Availability: " + product.getAvailNum());
                                break;
                            case 4:
                                System.out.println("\nProduct Description: " + product.getDescription()+ 
                                                   "\nChange to: ");
                                String prodDescriptionNew = scanner3.nextLine();
                                product.setDescription(prodDescriptionNew);
                                
                                System.out.println("New Description: " + product.getDescription());
                                break;
                            case 5:
                                System.out.println("\nProduct Supplier name: " + product.getSupplier().getSupplierName()+ 
                                                   "\nChange to: ");
                                String supplierNameNew = scanner3.nextLine();
                                product.getSupplier().setSupplierName(supplierNameNew);
                                
                                System.out.println("New Supplier name: " + product.getSupplier().getSupplierName());
                                break;
                            case 6:
                                try{
                                System.out.println("\nProduct Supplier number: " + product.getSupplier().getSupplierRegNbr()+ 
                                                   "\nChange to: ");
                                Integer supplierNbrNew = scanner3.nextInt();
                                product.getSupplier().setSupplierRegNbr(supplierNbrNew);
                                }
                                catch(InputMismatchException e){
                                System.out.println("Sorry! Numbers only");
                                continue label;
                                }
                                System.out.println("New Supplier number: " + product.getSupplier().getSupplierRegNbr());
                                break;
                            case 7:
                                System.out.println("\nProduct Supplier description: " + product.getSupplier().getSupplierDescription()+ 
                                                   "\nChange to: ");
                                String supplierDescNew = scanner3.nextLine();
                                product.getSupplier().setSupplierDescription(supplierDescNew);
                                
                                System.out.println("New Supplier number: " + product.getSupplier().getSupplierDescription());
                                break;
                            case 8:
                                x = 0;
                                break;
                    }
                }
                
                case 4:
                    i = 0;
                    break;
            }
        }
    }
}


