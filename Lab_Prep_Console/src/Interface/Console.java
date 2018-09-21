/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import java.util.Scanner;

/**
 *
 * @author Prabhu Surbamanian
 */

public class Console {
    
    public static void main (String arg[])
    {
        Product product = new Product();
        System.out.println("Create the product!");
        /*
        Create(product);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product name:");
        String prodName = scanner.nextLine();
        product.setName(prodName);
        
        System.out.println("Enter Product price:");
        String prodPrice = scanner.nextLine();
        product.setPrice(prodPrice);
        
        System.out.println("Enter Product availability number:");
        String prodAvailNbr = scanner.nextLine();
        product.setAvailNum(prodAvailNbr);
        
        System.out.println("Enter Product description");
        String prodDescription = scanner.nextLine();
        product.setDescription(prodDescription);
        
        System.out.println("Enter Product Supplier name");
        String supplierName = scanner.nextLine();
        product.getSupplier().setSupplierName(supplierName);
        
        System.out.println("Enter Product Supplier number");
        String supplierNbr = scanner.nextLine();
        product.getSupplier().setSupplierRegNbr(supplierNbr);
        
        System.out.println("Enter Product Supplier description");
        String supplierDesc = scanner.nextLine();
        product.getSupplier().setSupplierDescription(supplierDesc);
        
        
        System.out.println("Displaying the details you entered");
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Availability Number: " + product.getAvailNum());
        System.out.println("Product Description: " + product.getDescription());
        System.out.println("Product Supplier Name:" + product.getSupplier().getSupplierName());
        System.out.println("Product Supplier Registeration number: " + product.getSupplier().getSupplierRegNbr());
        System.out.println("Product Supplier Description: " + product.getSupplier().getSupplierDescription());
    }
    /*
    public void Create(Product product)
    {
        Scanner scanner = new Scanner(System.in);
        String prodName = scanner.nextLine();
        product.setName(prodName);
        
        String prodProce = scanner.nextLine();
        product.setPrice(prodProce);
        
        String prodAvailNbr = scanner.nextLine();
        product.setAvailNum(prodAvailNbr);
        
        String prodDescription = scanner.nextLine();
        product.setDescription(prodDescription);
        
        String supplierName = scanner.nextLine();
        product.getSupplier().setSupplierName(supplierName);
        
        String supplierNbr = scanner.nextLine();
        product.getSupplier().setSupplierRegNbr(supplierNbr);
        
        String supplierDesc = scanner.nextLine();
        product.getSupplier().setSupplierDescription(supplierDesc);
        
    }
    */

}
