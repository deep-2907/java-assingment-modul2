package Assignment;
import java.util.Scanner;
public class Computes_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =0;
		System.out.println("Enter the number :");
		number = sc.nextInt();
	    int n = number*10+number;
	    int r = number *100 + n;
		int result = number+n+r;	
		System.out.println(number);
		System.out.println(n);
		System.out.println(r);
	    System.out.println("The result is : " + result);
		sc.close();
	}

}
