package main.java.com.daoclasses;

import java.util.*;
import com.daoclasses.*;

class carMain{
	public static void main(String[] args) {
		System.out.println("======Main Menu======");
		System.out.println("1. List all Cars");
		System.out.println("2. List a Car's info");
		System.out.println("3. Update a car");
		System.out.println("4. Insert a car");
		System.out.println("5. Delete a car");
		System.out.println("6. Exit");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		submenu(ch);
		System.out.println("Exiting!!");
		sc.close();
	}

	static void submenu(int ch){
		switch(ch){
			case 1: cars[] car = cars.listAllCars();
				for(cars c: car){
					System.out.println(c.getCarName()+" "+
					c.getPrice());
				}
			break;
			default:
				System.out.println("Invalid option!");
				break;
		}
	}
}