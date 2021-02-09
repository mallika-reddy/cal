package com.epam.maven;
import java.util.*;
public class Epamtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();char ch=sc.next().charAt(0);
	if(ch=='+')
		System.out.println(x+y);
	else if(ch=='-')
		System.out.println(x-y);
	else if(ch=='*')
		System.out.println(x*y);
	else if(ch=='/')
	{
		if(x<y)
			System.out.println((float)x/y);
		else
		System.out.println(x/y);
	}
	}
}