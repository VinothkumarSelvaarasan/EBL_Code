package JaggedArray;

import java.util.Scanner;

public class JaggedArrayPgm {
	public static void main(String[] args) {
		String TechExpert[][]=new String[3][];
		Scanner s=new Scanner(System.in);
		TechExpert[0]=new String[2];
		TechExpert[1]=new String[1];
		TechExpert[2]=new String[3];
		for(int i=0;i<TechExpert.length;i++)
		{
			for(int j=0;j<TechExpert[i].length;j++)
			{
				System.out.println("Enter the Expert Seated On Room No "+(i+1)+(j+1));
				TechExpert[i][j]=s.next();
			}
		}
		System.out.println("*********** Print Info*******");
		for(int i=0;i<TechExpert.length;i++)
		{
			for(int j=0;j<TechExpert[i].length;j++)
			{
				System.out.println("Expert Seated On Room No "+(i+1)+(j+1)+ " is "+TechExpert[i][j]);
				
			}
		}
		
		
	}

}
