package com.InvertedStair.CodeX.InvertedDesign;

import java.util.Scanner;

/**
 * Create an Inverted Stair Design
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       	// Scanner object
		Scanner myObj = new Scanner(System.in);
		// User has to decide how many number of lines 
		System.out.println("Please enter the number of lines or inverted stair levels");
		int n = myObj.nextInt();
		myObj.close();
		InvertedStair.invertedStairDesign(n);
    }
}
