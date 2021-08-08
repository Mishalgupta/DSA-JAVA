//Lecture 6
package javapractice;
class Example {
private int length,bredth, height;
public void setdimension(int l, int b, int h)
{
	this.length=l;
	this.bredth=b;
	this.height=h;
}
public void showdimension()
{
	System.out.println("length="+length);
	System.out.println("bredth="+bredth);
	System.out.println("height="+height);
}
}
	class Box{
		
	public static void main(String[] args) {
		Example b1=new Example(); 
		b1.setdimension(2, 3, 5);
		b1.showdimension();
       b1=new Example();
        b1.setdimension(1, 2, 3);
        b1.showdimension();
	}

}
