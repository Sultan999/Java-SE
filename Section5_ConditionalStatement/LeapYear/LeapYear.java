package leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Find a given year is a leap year
		
		Scanner scan = new Scanner(System.in);
		
		int year;
		
		System.out.println("Please enter a year");
		
		year = scan.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println("Its a leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
			}
			else {
				System.out.println("Its a leap year");
			}
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
