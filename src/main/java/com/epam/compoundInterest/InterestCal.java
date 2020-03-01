package com.epam.compoundInterest;

import java.util.Scanner;

public class InterestCal {

	public static void interestCal(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Principle Amount :");
		try{
			double principle = sc.nextDouble();
			System.out.println("Number of years :");
			double years = sc.nextDouble();
			System.out.println("Rate of Interest :");
			double rate =  sc.nextDouble();
			double simpleInterest = (double)(principle * years * rate) / 100;
			double compoundInterest = (double)(principle * Math.pow(1 + (rate / 100), years) -principle);
			System.out.println("Simple interest is :" + simpleInterest);
			System.out.println("Compound interest is :" + compoundInterest);
		}catch(Exception e){
			System.out.println("INVALID INPUT");
}
		}
	
}
