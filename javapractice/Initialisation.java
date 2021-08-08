package javapractice;

public class Initialisation {
	
	private int x;
	{
		System.out.println("instance initilisation Block="+x);
		x=10;
		System.out.println("instance initilisation Block="+x);
	}
	public Initialisation()
	{
		System.out.println("Const.x="+x);
	}
//	*****************//
	private static int k;
	{
		System.out.println("static initilisation Block="+k);
		k=1;
		System.out.println("static initilisation Block="+k);
		
	}
	
	public static void main(String[] args) {	
//Initialisation i1=new Initialisation();
//Initialisation i2=new Initialisation();
//or
     new Initialisation();
	}

}
