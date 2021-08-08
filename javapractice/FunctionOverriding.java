package javapractice;

class A{
	public void f1(int i)
	{
		System.out.println("Class A");	}
}
class B extends A{
	public void f1(int i) {
		System.out.println("Class B");
	}
	public void fun()
	{
		final int k;
		{
			k=4;//final local variable is initialised using intance block
		}
		System.out.println(k);
	}
}
public class FunctionOverriding {

	public static void main(String[] args) {
		B b1=new B();
		A b2=new B();
		A b3=new A();
		b1.f1(2);
		b2.f1(3);
		b3.f1(3);
		b1.fun();

	}

}
