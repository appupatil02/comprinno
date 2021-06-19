package com.assessment.comprinno;



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pgm10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Integer no_of_test_cases = sc.nextInt();
		int basic_salary;
		double DA = 0.0, HRA = 0.0, gross_salary;
		while(no_of_test_cases-- > 0){
		    basic_salary = sc.nextInt();
		    if(basic_salary < 1500){
		         HRA = basic_salary * 0.1;
		         DA = basic_salary * 0.9;
		    }else if(basic_salary >= 1500){
		         HRA = 500;
		         DA = basic_salary * 0.98;
		    }
		    gross_salary = basic_salary + HRA + DA;
		    System.out.format("%.2f",gross_salary); System.out.println();
		}
	}
}
