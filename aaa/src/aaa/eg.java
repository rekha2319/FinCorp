package aaa;

class one {
	void powerone()
	{
		int h=20;
		System.out.println(h);
	}
	void powertwo()
	{
		int h=20;
		int h1=h*h;
		System.out.println(h1);
	}
}
class two extends one{
	void powerthree()
	{
		int h=20;
		int h2=h*h*h;
		System.out.println(h2);
	}
	public static void main(String[] args) {
		
		two cc=new two();
		cc.powerthree();
		cc.powertwo();
		cc.powerone();

	}
}

