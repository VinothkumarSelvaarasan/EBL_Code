package LoopingStatement;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int limit,multi;
		int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit");
		limit=s.nextInt();
		System.out.println("Enter the Multiplication Table do u want to Print");
		multi=s.nextInt();
		while(i<=limit)
		{
			System.out.println(i +" * "+multi+" = "+(i*multi));
			//i++;
		}
	}

}
