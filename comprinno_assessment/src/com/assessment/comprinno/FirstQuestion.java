package com.assessment.comprinno;
import java.util.*;
import java.io.*;
class FirstQuestion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>0)
		{
			int arr[]=new int[3];
			int brr[]=new int[3];
			int crr[]=new int[3];
			for(int i=0; i<3; i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int i=0; i<3; i++)
			{
				brr[i]=sc.nextInt();
			}
			for(int i=0; i<3; i++)
			{
				crr[i]=sc.nextInt();
			}
			//Arrays.sort(arr);
			//Arrays.sort(brr);
			//Arrays.sort(crr);
		//	System.out.println("TEST "+test);
			boolean flag1=true;
			boolean correct1=false;
			boolean flag2=true;
			boolean correct2=false;
				correct2=false;
			for(int i=0; i<3; i++)
			{
				if(brr[i]<arr[i])
					flag1=false;
				if(crr[i]<brr[i])
					flag2=false;
				if(brr[i]>arr[i])
					correct1=true;
				if(crr[i]>brr[i])
					correct2=true;
			}
            if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(brr[i]>arr[i])
					flag1=false;
				if(crr[i]<arr[i])
					flag2=false;
				if(brr[i]<arr[i])
					correct1=true;
				if(crr[i]>arr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
		    flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(crr[i]>brr[i])
					flag1=false;
				if(arr[i]<brr[i])
					flag2=false;
				if(crr[i]<brr[i])
					correct1=true;
				if(arr[i]>brr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(crr[i]<brr[i])
					flag1=false;
				if(arr[i]<crr[i])
					flag2=false;
				if(crr[i]>brr[i])
					correct1=true;
				if(arr[i]>crr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(arr[i]<crr[i])
					flag1=false;
				if(brr[i]<arr[i])
					flag2=false;
				if(arr[i]>crr[i])
					correct1=true;
				if(brr[i]>arr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			flag1=true;
            correct1=false;
			flag2=true;
			correct2=false;
			for(int i=0; i<3; i++)
			{
				if(crr[i]<arr[i])
					flag1=false;
				if(brr[i]<crr[i])
					flag2=false;
				if(crr[i]>arr[i])
					correct1=true;
				if(brr[i]>crr[i])
					correct2=true;
			}
			 if(flag1==true && flag2==true && correct1==true && correct2==true)
			{
				System.out.println("yes");
					test--;
				continue;
			}
			System.out.println("no");
				test--;
		}
	}
}
