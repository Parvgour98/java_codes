package com.hexaware.util;
import java.util.*;
import com.hexaware.model.*;

/**
 * Main Menu class
 *
 */
public class App 
{
    Scanner sc = new Scanner(System.in);

    void mainMenu(){
        System.out.println("============MAIN MENU===========");
        System.out.println("1. Product Details");
        System.out.println("2. Invoice Details");
        System.out.println("3. Exit");
        System.out.println("Select the option:");
        int ch = sc.nextInt();
        switch(ch){
            case 1: 
                System.out.println("======Product Menu========");
                System.out.println("1. List of Products");
                System.out.println("Option please");
                switch(choice){
                    case 1: Product p = new Product(); 
                    p.listProducts();
                }
                break;
            default:
                break;
        }
        
        //subMenu(ch);
    }

    static void subMenu(int ch){
        switch(ch){

        }
    }
    public static void main( String[] args )
    {
        
    }
}
