package Assignment;
import java.util.Scanner;
public class Factorial {
	static void fact(int a) {

		int i=a;
		while(a>1) {
			--a;
			i=i*a;
		}
		System.out.println("Factorial is :" + i);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter the number :");
		number = sc.nextInt();
		fact(number);
		

	}

}
