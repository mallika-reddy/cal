package caltest1;

public class Calculator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator();
		System.out.println(c1.add (5,6));
		System.out.println(c1.sub (2,1));
		System.out.println(c1.multiply(3,4));
		System.out.println(c1.divide(10,5));
	}
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
	public int multiply(int x,int y)
	{
		return x*y;
	}
	public int divide(int x,int y)
	{
		return x/y;
	}
}