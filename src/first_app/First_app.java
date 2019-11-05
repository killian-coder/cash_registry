/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_app;

import java.util.Scanner;

/**
 *
 * @author Odette
 */
public class First_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total_price;
        double sum;
        double price;
        double vat;
        
       
        
        total_price = 0;
        //price = 0;
        vat =16;
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter  the price of the item");
         price =  scan.nextDouble();
         
        if(price>10){
            sum = (vat/100)* price;
            total_price = sum  +price;
            System.out.println("you have reached the Tax trashholder your total price is :"+total_price);
        }else
        {
         sum = (vat/100)* price;
         total_price = sum + price;
         System.out.println("you are not taxed , Your total price is : "+total_price);
        }
        
       
        
        
        
    }
    
}
