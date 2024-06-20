package LoopingStatement;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		int limit,multi;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit");
		limit=s.nextInt();
		System.out.println("Enter the Multiplication Table do u want to Print");
		multi=s.nextInt();
		for(int i=1;i<=limit;i++)
		{
			System.out.println(i +" * "+multi+" = "+(i*multi));
		}
		
		
	}

}
