package Assignment;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		grade(a);
	}
	static void grade(int marks) {
		Scanner sc = new 	Scanner(System.in);
		 marks = 0;
		System.out.println("Enter the marks :");
		marks = sc.nextInt();
		if(marks>=90 && marks<=100 ) {
			System.out.println("A");
		}else if(marks>=80 && marks<=90 ) {
			System.out.println("B");
		}else if(marks>=70 && marks<=80 ) {
			System.out.println("C");
		}else if(marks>=60 && marks<=70 ) {
			System.out.println("D");
		}else if(marks>=50 && marks<=60 ) {
			System.out.println("E");
		}else {
			System.out.println("Fail");
		}
		
	}

}
