package com.assessment.comprinno;

import java.util.*;
import java.lang.*;
import java.io.*;


public class pgm11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int m=0;m<t;m++){
		    char c = sc.next().charAt(0);
		    if(c == 'B' || c == 'b'){
		        System.out.println("BattleShip");
		    }
		    else if(c == 'C' || c == 'c'){
		        System.out.println("Cruiser");
		    }
		    else if(c == 'D' || c == 'd'){
		        System.out.println("Destroyer");
		    }
		    else if(c == 'F' || c == 'f'){
		        System.out.println("Frigate");
		    }
		}
	}
}
