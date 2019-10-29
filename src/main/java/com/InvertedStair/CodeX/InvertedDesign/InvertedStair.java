package com.InvertedStair.CodeX.InvertedDesign;

public class InvertedStair {
	public static void invertedStairDesign(int n)
	{
		// number of lines / rows & columns controller
				for (int i=1;i<=n;i++) {
					// number of space controllers
					for (int j=1;j<i;j++) {
						System.out.print(" ");
					}
					// number of symbols controller
					for (int z=n;z>i-1;z--) {
						System.out.print("=");
					}
					
					// new line
					System.out.println();
				}
	}
}
