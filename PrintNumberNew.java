package Java_Practicle;

public class PrintNumberNew {

	public void printn(int a) {
		System.out.println("int :" +a);
		
	}
	public void printn(String n) {
		System.out.println("String :" +n);
}
	public void printn(float f) {
		System.out.println("float :" +f);
}
public void printn(double d) {
	System.out.println("double"+ d);
}
public void printn(boolean b) {
	System.out.println("boolean :" + b);
}
public void printn(char c) {
	System.out.println("char :"+c);
}

	public static void main(String[] args) {
	
		PrintNumberNew p = new PrintNumberNew();
		p.printn(20);
		p.printn("Dipak");
		p.printn(20.20);
		p.printn(2000000);
		p.printn(false);
		p.printn('D');

		}
}

