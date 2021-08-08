package javapractice;

class Lengthh{
	private int length,bredth,height;
	public void set(int length,int bredth,int height)
	{
		this.length=length;
		this.bredth=bredth;
		this.height=height;
	}
	public void show()
	{
//		Gifttaker g1=new Gifttaker();
//				g1.acceptGift(this);
		System.out.println(length+"\n"+bredth+"\n"+height);
	}
}
public class ThisSuper {

	public static void main(String[] args) {
           Lengthh b1= new Lengthh();
        		   b1.set(2, 3, 5);
           b1.show();

	}

}
