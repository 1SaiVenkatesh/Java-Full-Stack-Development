package com.simplilearn.LongestSubsequence;

import java.util.Scanner;

public class LongestIncreasingApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = "yes";
		while(s.equalsIgnoreCase("yes")){
		
			LongestIncreasingSub lis = new LongestIncreasingSub();
			lis.getLength();
			lis.findLIS();
			
			System.out.println("Do you like to continue? (Y / N)");
			s = sc.next();
		}
		
		System.out.println("Thank you !");
		
	}
}