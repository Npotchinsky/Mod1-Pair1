package com.techelevator;
import java.util.Scanner;
/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);
	System.out.println("Please enter bill amount: ");
	double amountOfBill = Input.nextDouble();
	System.out.println("Please enter amount tendered: ");
	double amountTendered = Input.nextDouble();
	System.out.println("Change required: " + (amountTendered - amountOfBill));
	}

}
