package basics;

public class B {
public static void main(String[] args) {
	A a1=new A(20);
	System.out.println(a1.getI());
	a1.setI(30);
	System.out.println(a1.getI());
	a1.setI(50);
	System.out.println(a1.getI());
}
}
