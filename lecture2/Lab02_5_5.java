package phanguyen.lecture2;

import java.util.Scanner;

public class Lab02_5_5 {

	public static boolean isConstain(String x, String[] list) {
		for (int i = 0; i < list.length; i++) {
			if (x.equals(list[i]) == true) {

				return true;
			}
		}
		return false;
	}

	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			} else
				isLeap = true;
		} else {
			isLeap = false;
		}
		return isLeap;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int daysCom[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int daysLeaf[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String months[][] = { { "1", "Jan.", "Jan", "January" }, { "2", "Feb", "Feb.", "Feburary" },
				{ "3", "Mar", "Mar.", "March" }, { "4", "Apr", "Apr.", "April" }, { "5", "May", "May." },
				{ "6", "Jun", "Jun.", "June" }, { "7", "Jul", "Jul.", "July" }, { "8", "Aug", "Aug.", "August" },
				{ "9", "Sep", "Sept.", "September" }, { "10", "Oct", "Oct.", "October" },
				{ "11", "Nov", "Nov.", "November" }, { "12", "Dec", "Dec.", "December" } };
		System.out.print("enter month:");
		String strMonth=keyboard.nextLine();
		
		System.out.print("enter year:");
		int iYear=keyboard.nextInt();
		for(int i=0;i<12;i++) {
			if(isConstain(strMonth,months[i])==true) {
				if(isLeapYear(iYear) == true) {
					System.out.println("days="+daysLeaf[i]);
				}else {
					System.out.println("days="+daysCom[i]);
				}
			}
		}
	}

}
