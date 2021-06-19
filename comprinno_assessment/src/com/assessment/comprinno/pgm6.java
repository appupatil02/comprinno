package com.assessment.comprinno;

import java.util.Scanner;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pgm6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long c = sc.nextLong();
            long d = sc.nextLong();
            long l = sc.nextLong();
            long min=0;
            long max = (c+d)*4;
           
            if(c<=2*d)
            {
                min = 4*d;
            }
           
            else
            {
                min = (c-d)*4;
            }
            
            if(l%4==0 && l<=max && l>=min)
            {
                System.out.println("yes");
            }
            
            else
            {
                System.out.println("no");
            }

		}
	}
}
