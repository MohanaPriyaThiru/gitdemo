package newPro;

public class OperatorsDemo {
	
	public void  arithmetic() {
		int a= 20,b=30,c=35;
		int sum = a+b+c;
		System.out.println("total ="+sum);
		int sub= c-b;
		System.out.println("sub="+sub);		
	}
	
	public void logical() {
		short a= 5,b=10,c=15;
		System.out.println("logical AND ="+ ((a==b)&&(b>a)));
		System.out.println("logical OR ="+ ((a==c)||(b>a)));
		System.out.println("logical NOT ="+ !((a==b)&&(b>a)));
	}
	public void unnary() {
		int a=5;
		a=++a;
		System.out.println(a);
	}
	public static void main(String [] args) {
		//classname ojname = new classname
		OperatorsDemo ar = new OperatorsDemo();
		ar.arithmetic();
		ar.logical();
		ar.unnary();
	}

}
