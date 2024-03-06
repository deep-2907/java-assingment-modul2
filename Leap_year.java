package Assignment;
import java.util.Scanner;
public class Leap_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.println("Enter the year :");
		year = sc.nextInt();
		sc.close();
		if(year%4==0 || year % 400 == 0) {
			System.out.println("The year is leap year");
		}else {
			System.out.println("The year is not leap year");
		}
	}
}
