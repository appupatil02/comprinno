package com.assessment.comprinno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
1 1 ≤ T(testCases) ≤ 50 
2 1 ≤ N(minutes) ≤ 50
3 Each Si(input) is either "cookie" or "milk" 
4 check every string of Si is cookie or milk
5 iterate over every minute and check for occurrences of consecutive cookie
6 if consecutive cookies occurrence found break the iteration
7 if two consecutive cookies are found OR last occurrence is cookie then print No else print yes
 */
public class cookieMilkProgram {

	public static void main(String[] args) {
		// code goes here
		Scanner sc =new Scanner(System.in);// read input from the input
		int testCases = sc.nextInt();
		
		List<String> validInputs = new ArrayList<String>(Arrays.asList("cookie","milk"));
		for(int i=0;i<testCases;i++)//checking the testCases(1 ≤ T ≤ 50)
		{
			int minutes = sc.nextInt();
			String check[] = new String[minutes];
			for(int j=0;j<minutes;j++) //1 ≤ N ≤ 50
			{
				String var = sc.next();
				
				//allowed input is cookie or milk
				if(validInputs.contains(var))
					check[j]= var;
				else
				{
					System.out.println("Please enter valid input : cookie or milk ");//For entering valid inputs
					return;
				}
			}
			boolean isfound=false;
			for(int j=0;j+1<minutes;j++)//iterate over every minute
			{
				// 
				if(check[j].equals("cookie") && check[j+1].equals("cookie"))//checking 2 consecutive cookies
				{
					isfound=true;
					break;
				}
			}
			//if two consecutive cookies are found OR last occurrence is cookie then print No else print yes 
			if(isfound || check[minutes-1].equals("cookie"))
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
