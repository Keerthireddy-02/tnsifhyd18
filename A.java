package access;

public class A {
	int a=10;
	static int b=20;
	void disp() {
		System.out.println("instance method");
	}
	public static void disp1() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a);
		a1.disp();
		System.out.println(A.b);
		A.disp1();
		
	}

}
