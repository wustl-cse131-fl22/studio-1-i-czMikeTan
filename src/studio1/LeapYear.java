package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a year.");
		int yearNum = in.nextInt();
		Boolean leapYear = (((yearNum%4==0) && (yearNum%100!=0)) ||(yearNum%400==0));
		System.out.println(yearNum + " is a leap year: "+ leapYear);
		
	}

}
