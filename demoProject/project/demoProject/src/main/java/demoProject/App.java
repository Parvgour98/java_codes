package demoProject;

import java.util.Scanner;

import models.*;

/**
 * main class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean success = login();
        if(success == true){
            MainMenu();
        }
    }

    static void MainMenu(){
        System.out.println("=========MAIN MENU=========");
        System.out.println("1. List All Customers");
        System.out.println("2. List All Accounts");
        System.out.println("3. List a Customer's info");
        System.out.println("4. List a Account's info");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);

        System.out.println("Select from menu: ");
        int ch = sc.nextInt();

        
    }

    static boolean login(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username");
        String user = sc.next();
        System.out.println("Enter Password");
        String pass = sc.next();
        if(user.equals("pallavi") && pass.equals("password")){
            System.out.println("login successful");
            sc.close();
            return true;
        }
        System.out.println("Login unsuccessful");
        sc.close();
        return false;
    }
}
