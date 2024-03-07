package Assignment;

import java.util.Scanner;

public class Startd_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		System.out.println("Enter the last string :");
		String str1=sc.nextLine();
		
		boolean result=  str.startsWith(str1);
		
		  System.out.println(result);
		
		sc.close();
	}

}
