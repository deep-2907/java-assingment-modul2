package Assignment;
import java.util.Scanner;
public class Special_charector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charector :");
		int a =0;
		char ch = sc.next().charAt(0);
	    if(ch>='A' && ch<='Z')
	    {
	        System.out.println("this cheractor is uppercase");
	    }
	    else if(ch>='a' && ch<='z')
	    {
	    	System.out.println("this cheractor is lowercase");
	    }
	    else if(a>=0 && a<=9)
	    {
	    	System.out.println("this cheractor is digit");
	    }
	    else
	    {
	    	System.out.println("this cheractor is special ");
	    }
		
	}

}
