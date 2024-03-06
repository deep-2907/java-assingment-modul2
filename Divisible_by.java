package Assignment;

public class Divisible_by {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for(a=1; a<=100; a++) {
			if(a%3==0 || a%5==0) {
				System.out.println(a);
			}
		}
		for(a=1; a<=100; a++) {
			if(a%3==0 && a%5==0) {
				System.out.println("Numbers those divided by 3 and 5 :"   +a);
			}
		}
	}

}
