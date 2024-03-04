package Assignment;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first_number = 0;
		int second_number = 0;
		int third_number = 0;
		System.out.println("Enter the first number :");
		first_number = sc.nextInt();
		System.out.println("Enter the second number :");
		second_number = sc.nextInt();
		System.out.println("Enter the third number :");
		third_number = sc.nextInt();
		if(first_number >= second_number && first_number>=third_number)
		{
			System.out.println("First number is greater :" + first_number);
		}else if(second_number>=third_number) {
			System.out.println("Second number is greater :" + second_number);
		}else {
			System.out.println("Third number is greater :" + third_number);
		}
		
	}

}
