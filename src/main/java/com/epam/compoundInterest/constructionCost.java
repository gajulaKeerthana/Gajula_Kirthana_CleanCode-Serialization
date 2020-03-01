package com.epam.compoundInterest;

import java.util.Scanner;

public class constructionCost {
	public static void CalCost(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : 1. Standard materials\n2. Above standard materials\n3. High standards materials\n4.High standard materials and fully automated home");
		try{
		int choice = sc.nextInt();
		System.out.println("Total area of house:");
		double area = sc.nextDouble();
		double cost = 0;
		switch(choice){
		case(1):
			cost = 1200 * area;
			break;
		case(2):
			cost = 1500 * area;
			break;
		case(3):
			cost = 1800 * area;
			break;
		case(4):
			cost = 2500 * area;
			break;	
		default:
			System.out.println("INVALID INPUT");
			
		}
		System.out.println("total cost :" + cost);
		}
		catch(Exception e){
			System.out.println("INVALID INPUT");
}
	}
}
