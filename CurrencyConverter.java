import java.util.Scanner;
import java.text.DecimalFormat;
/*
 * AUthor: Zyon Treasure
 * Date: 07-4-23
 * Description: This program allows the user to calculate the conversion rate between 5 currencies
 */
public class CurrencyConverter 
{
	//declarations:
	static Scanner get = new Scanner(System.in);
	static DecimalFormat DF = new DecimalFormat("##.##");
	
	public static void main(String[] args) 
	{
		//declarations:
		int selection = 0;
		double amount = 0.00;
		double conversion = 0.00;
		while(selection != 6) 
		{
			selection = menu1();
			//--------------------------------------------------------
			switch(selection) 
			{
				case 1: System.out.println("Enter currency amount: ");
						amount = getAmount();
						selection = 0;
						while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						{
							selection = menu2();
							//--------------------------------------------------------
							switch(selection) 
							{
								case 1: conversion = amount * 1;	//calculate conversion
										System.out.println("United States Dollar: " + DF.format(amount) + "\n" +
				        									"United States Dollar: " + DF.format(conversion));
								        break;
								case 2: conversion = amount * 1.32;	//calculate conversion
										System.out.println("United States Dollar: " + DF.format(amount) + "\n" +
			        										"Canadian Dollar: " + DF.format(conversion));
								        break;
								case 3: conversion = amount * 0.92;	//calculate conversion
										System.out.println("United States Dollar: " + DF.format(amount) + "\n" +
			        										"Euro: " + DF.format(conversion));
										break;
								case 4: conversion = amount * 144.46;	//calculate conversion
										System.out.println("United States Dollar: " + DF.format(amount) + "\n" +
			        							"Japanese Yen: " + DF.format(conversion));
								        break;
								case 5: conversion = amount * 7.21;	//calculate conversion
										System.out.println("United States Dollar: " + DF.format(amount) + "\n" +
						       								"Chinese Yuan: " + DF.format(conversion));
										break;
								default: System.out.println("Invalid selection...");
							}//end switch(selection) 
							//---------------------------------------------------------
						}//end while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
			            break;
				case 2: System.out.println("Enter currency amount: ");
						amount = getAmount();
						selection = 0;
						while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						{
							selection = menu2();
							//--------------------------------------------------------
							switch(selection) 
							{
								case 1: conversion = amount * 0.76;	//calculate conversion
										System.out.println("Canadian Dollar: " + DF.format(amount) + "\n" +
			        										"United States Dollar: " + DF.format(conversion));
								        break;
								case 2: conversion = amount * 1;	//calculate conversion
										System.out.println("Canadian Dollar: " + DF.format(amount) + "\n" +
			    											"Canadian Dollar: " + DF.format(conversion));
								        break;
								case 3: conversion = amount * 0.70;	//calculate conversion
										System.out.println("Canadian Dollar: " + DF.format(amount) + "\n" +
			    											"Euro: " + DF.format(conversion));
										break;
								case 4: conversion = amount * 109.25;	//calculate conversion
										System.out.println("Canadian Dollar: " + DF.format(amount) + "\n" +
			    											"Japanese Yen: " + DF.format(conversion));
								        break;
								case 5: conversion = amount * 5.45;	//calculate conversion
										System.out.println("Canadian Dollar: " + DF.format(amount) + "\n" +
			        										"Chinese Yuan: " + DF.format(conversion));
										break;
								default: System.out.println("Invalid selection...");
							}//end switch(selection) 
						}//end while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						break;
				case 3: System.out.println("Enter currency amount: ");
						amount = getAmount();
						selection = 0;
						while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						{
							selection = menu2();
							//--------------------------------------------------------
							switch(selection) 
							{
								case 1: conversion = amount * 1.09;	//calculate conversion
								        System.out.println("Euro: " + DF.format(amount) + "\n" +
								        					"United States Dollar: " + DF.format(conversion));
							            break;
								case 2: conversion = amount * 1.44;	//calculate conversion
						        		System.out.println("Euro: " + DF.format(amount) + "\n" +
			        										"Canadian Dollar: " + DF.format(conversion));
										break;
								case 3: conversion = amount * 1;	//calculate conversion
								        System.out.println("Euro: " + DF.format(amount) + "\n" +
					        								"Euro: " + DF.format(conversion));
										break;
								case 4: conversion = amount * 157.22;	//calculate conversion
						        		System.out.println("Euro: " + DF.format(amount) + "\n" +
			        										"Japanese Yen: " + DF.format(conversion));
								break;
								case 5: conversion = amount * 7.85;	//calculate conversion
						        		System.out.println("Euro: " + DF.format(amount) + "\n" +
			        										"United States Dollar: " + DF.format(conversion));
								break;
								default: System.out.println("Invalid selection...");
							}//end switch(selection) 
						}//end while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						break;
				case 4: System.out.println("Enter currency amount: ");
						amount = getAmount();
						selection = 0;
						while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						{
							selection = menu2();
							//--------------------------------------------------------
							switch(selection) 
							{
								case 1: conversion = amount * 0.0069;	//calculate conversion
								        System.out.println("Japanese Yen: " + DF.format(amount) + "\n" +
								        					"United States Dollar: " + DF.format(conversion));
							            break;
								case 2: conversion = amount * 0.0092;	//calculate conversion
						        		System.out.println("Japanese Yen: " + DF.format(amount) + "\n" +
			        										"Canadian Dollar: " + DF.format(conversion));
										break;
								case 3: conversion = amount * 0.0064;	//calculate conversion
								        System.out.println("Japanese Yen: " + DF.format(amount) + "\n" +
					        								"Euro: " + DF.format(conversion));
										break;
								case 4: conversion = amount * 1;		//calculate conversion
						        		System.out.println("Japanese Yen: " + DF.format(amount) + "\n" +
			        										"Japanese Yen: " + DF.format(conversion));
								break;
								case 5: conversion = amount * 0.05;		//calculate conversion
						        		System.out.println("Japanese Yen: " + DF.format(amount) + "\n" +
			        										"Chinese Yuan: " + DF.format(conversion));
								break;
								default: System.out.println("Invalid selection...");
							}//end switch(selection) 
						}//end while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						break;
				case 5: System.out.println("Enter currency amount: ");
						amount = getAmount();
						selection = 0;
						while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						{
							selection = menu2();
							//--------------------------------------------------------
							switch(selection) 
							{
								case 1: conversion = amount * 0.14;	//calculate conversion
								        System.out.println("Chinese Yuan: " + DF.format(amount) + "\n" +
								        					"United States Dollar: " + DF.format(conversion));
							            break;
								case 2: conversion = amount * 0.18;	//calculate conversion
						        		System.out.println("Chinese Yuan: " + DF.format(amount) + "\n" +
			        										"Canadian Dollar: " + DF.format(conversion));
										break;
								case 3: conversion = amount * 0.13;	//calculate conversion
								        System.out.println("Chinese Yuan: " + DF.format(amount) + "\n" +
					        								"Euro: " + DF.format(conversion));
										break;
								case 4: conversion = amount * 20.02;	//calculate conversion
						        		System.out.println("Chinese Yuan: " + DF.format(amount) + "\n" +
			        										"Japanese Yen: " + DF.format(conversion));
								break;
								case 5: conversion = amount * 1;	//calculate conversion
						        		System.out.println("Chinese Yuan: " + DF.format(amount) + "\n" +
			        										"Chinese Yuan: " + DF.format(conversion));
								break;
								default: System.out.println("Invalid selection...");
							}//end switch(selection) 
						}//end while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 )
						break;
				case 6: System.out.println("Goodbye!");
				break;
				default: System.out.println("Invalid selection...");
			}//end switch(selection) 
			//---------------------------------------------------------
		}//end while(selection != 6) 
	}//end main
	//---------------------------------------------------
	public static int menu1()	//determines the currency the user wants to start with
	{
		int selection = 0;
		System.out.println("Select the currency you want to convert\n"		+
											"-1- United States Dollar\n"    +
	                                        "-2- Canadian Dollar\n" 		+
				                            "-3- Euro\n" 					+
	                                        "-4- Japanese Yen\n"         	+
	                                        "-5- Chinese Yuan\n"          	+
	                                        "-6- Quit program\n"          	+
				                            "Enter your selection 1-6: ");
		selection = get.nextInt();
		return selection;
	}//end menu1	
	//-------------------------------------------------------
	public static int menu2()	//determines the currency that the user wants to convert to
	{
		int selection = 0;
		System.out.println("Select the currency you want to convert to\n"	+
											"-1- United States Dollar\n"    +
	                                        "-2- Canadian Dollar\n" 		+
				                            "-3- Euro\n" 					+
	                                        "-4- Japanese Yen\n"         	+
	                                        "-5- Chinese Yuan\n"         	+
				                            "Enter your selection 1-5: ");
		selection = get.nextInt();
		return selection;
	}//end menu2	
	//-------------------------------------------------------
	public static double getAmount()	//determines the original currency amount
	{
		double amount = 0.00;
		amount = get.nextDouble();
		
		return amount;
	}//end getAmount	
	//-------------------------------------------------------
}
