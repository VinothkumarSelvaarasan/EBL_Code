package VoterChecker;

import java.util.Scanner;

class VoterChecker extends Exception
{
	VoterChecker(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}


public class VoteChecker {
	int age;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter your Age ");
		age=s.nextInt();
	}
	void printData() throws VoterChecker
	{
		if(age>=18)
		{
			System.out.println("Your are Eligible to Vote");
		}
		else
		{
			throw new VoterChecker("You are not Eligible to Vote");
		}
	}
	public static void main(String[] args) {
		VoteChecker voteChecker=new VoteChecker();
		voteChecker.getData();
		try {
			voteChecker.printData();
		}
		catch(VoterChecker vc)
		{
			System.out.println(vc);
		}
		
	}

}
