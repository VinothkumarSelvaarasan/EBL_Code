package Array2d;

import java.util.Scanner;

public class WareHousePgm {
	public static void main(String[] args) {
		String WareHouse[][]=new String[2][3];
		Scanner S=new Scanner(System.in);
		for(int i=0;i<WareHouse.length;i++)
		{
			for(int j=0;j<WareHouse[i].length;j++)
			{
				System.out.println("Enter the Product u want to Store on Room No "+(i+1)+(j+1));
				WareHouse[i][j]=S.next();
				
			}
		}
		
		System.out.println("***********Print Product Location Info***");
		for(int i=0;i<WareHouse.length;i++)
		{
			for(int j=0;j<WareHouse[i].length;j++)
			{
				System.out.println("Product on Room Number "+(i+1)+(j+1)+WareHouse[i][j]);
				
				
			}
		}
	}
		

}
