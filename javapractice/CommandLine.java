package javapractice;

public class CommandLine {
private int A,B,C;
public CommandLine()
{
	A=10;
	B=20;
	C=30;
}
public CommandLine(int a, int b ,int c)
{
	this.A=a;
	this.B=b;
	this.C=c;
}

public void ShowCommandLine()
{
	System.out.println(A);
System.out.println(B);
System.out.println(C);
	}
	public static void main(String[] args) {
		CommandLine c1= new CommandLine();
		CommandLine c2= new CommandLine(1,2,3);
		c1.ShowCommandLine();
		c2.ShowCommandLine();
		}
}
