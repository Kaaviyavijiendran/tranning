package trainee.chainsys.java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
	
		if(year%100==0)
		{
				if(year%400==0)
		{
			System.out.println("Leap year");
		}
				else 
				{
					System.out.println("Not a leap year");
				}	
		}
				
				else
				{
					if(year%4==0)
		{
			System.out.println("Leap year");
		}
		
		else 
		{
			System.out.println("Not a leap year");
		}		
		
	}

	}
}

