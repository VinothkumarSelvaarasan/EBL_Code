package CustomizedException;

import CustomizedException.*;
import java.util.Scanner;

public class OrderProduct {
	String productName;
	int productPrice;
	int productQuantity;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Product Name ");
		productName=s.next();
		System.out.println("Enter the Product Price");
		productPrice=s.nextInt();
		System.out.println("Enter the Product Quantity ");
		productQuantity=s.nextInt();
		
	}
	void printData() throws QuantityCheck
	{
		if(productQuantity>=5)
		{
			throw new QuantityCheck("You are not allow to take product More than 5");
		}
		else
		{
			System.out.println("Product Name "+productName);
			System.out.println("Product Price "+productPrice);
			System.out.println("Product Qunatity "+productQuantity);
			System.out.println("Total Amount "+(productPrice*productQuantity));
		}
	
	}
	public static void main(String[] args) throws QuantityCheck {
		OrderProduct orderProduct=new OrderProduct();
		orderProduct.getData();
		try {
			orderProduct.printData();
		}
		catch (QuantityCheck e) {
			System.out.println(e);
		}
	}

}
