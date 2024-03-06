package Assignment;

import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =0;
		int count = 0;
		System.out.println("Enter the Number :");
		Scanner sc =new Scanner (System.in);
		number =sc.nextInt();
		
		while(number>0) {
			int rem=number%10;
			number = number/10;
			count++;
			
		}sc.close();
		System.out.println(count);
		
	}

}
