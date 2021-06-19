package com.assessment.comprinno;

import java.util.*;
import java.lang.*;
import java.io.*;


class pgm1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// create a scanner
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long n = sc.nextLong();
            int[] arr = new int[60];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++)
            {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
            }
            
            long k = 1;
            while (n > 1)
            {
                k = k * 2;
                n = n / 2;
            }
            System.out.println(arr[(int)(k % 60 - 1)]);
        }
	}
}
