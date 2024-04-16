package Java_Practicle;


public class Area_S {
	public void area(int squere) {
		squere=squere*squere;
		System.out.println("Area of squere is :" + squere);
	}
	public void area(int l,int w) {
		int result=l*w;
		System.out.println("Area of rectengle is :" + result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area_S a= new 	Area_S();
		a.area(20);
		a.area(10, 20);
	}

}
