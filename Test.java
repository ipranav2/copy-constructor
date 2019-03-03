class Test
{
	int x,y;
	Test(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Test(Test t)	//copy constructor
	{
		this.x=t.x;
		this.y=t.y;
	}
	void show()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public static void main(String S[])
	{
		Test t1,t2;
		t1=new Test(5,6);
		t2=new Test(t1);
		t1.show();
		t2.show();
	}
}	