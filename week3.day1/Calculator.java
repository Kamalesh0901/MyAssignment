package week3.day1;

public class Calculator {
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public void multiple(double x,double y)
	{
		System.out.println(x*y);
	}
	public void multiple(float x,float y)
	{
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		Calculator obj= new Calculator();
		obj.add(5, 10);
		obj.add(10, 15, 20);
		obj.multiple(0.5d, 2.5d);
		obj.multiple(1.5f, 3.5f);

	}

}
