package Assignment;
import java.util.Scanner;
public class Five_numbers {
	public static void main(String[]args) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int result =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the five number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
	    sc.close();
	    result = a + b + c + d + e;
	    System.out.println(result);
	    System.out.println("Avrage of five number is :" + result /5);
	
	}
	
}
