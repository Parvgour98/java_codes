package com.hexaware;

import com.daoclasses.*;

import java.util.Scanner;

public class carMain{
    public static void main(String[] args) {
        mainMenu();
    }

    static void mainMenu(){
        System.out.println("1. List all Cars");
        System.out.println("2. List a car");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your option: ");
        int ch = sc.nextInt();

        subMenu(ch);
        sc.close();
    }

    static void subMenu(int ch){
        switch(ch){
            case 1: listAllCarDetails();
                break;
            default:
                break;
        }
    }

    static void listAllCarDetails(){
        cars[] car = cars.listAllCars();
        for(cars c : car){
            System.out.println(c.getCarName()+ " " + c.getPrice());
        }
    }
}