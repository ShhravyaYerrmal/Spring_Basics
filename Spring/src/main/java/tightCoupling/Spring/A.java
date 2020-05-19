package tightCoupling.Spring;

public class A {
	public B b;
	public A() {
	System.out.println("inside A constructor");
	b=new B();
	b.printData();
	}
	

}
