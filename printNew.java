package Java_Practicle;

public class printNew {
	public void print(int a,char b) {
		System.out.println(a+" "+b);
	}
	public void print(char b,int a) {
		System.out.println(b+" "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNew p = new printNew();
		p.print(10, 'c');
		p.print('d', 20);
	}

}
