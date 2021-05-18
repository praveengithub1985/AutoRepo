
abstract class SuperClass
{
	abstract int sumOfTwo(int a, int b);
	abstract int sumOfThree(int a, int b, int c);
	void disp()
	{
		System.out.println("This is a Concrete Method");
	}
	void ide()
	{
		System.out.println("This is a Concrete Method");
	}
}
public class AbstractClass1 extends SuperClass
{
	int sumOfTwo(int a,int b)
	{
		return a+b;
	}
	int sumOfThree(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		//Normal way of creating object and accessing the abstract methods
		AbstractClass1 obj1=new AbstractClass1(); 
		//Upcasting to create object and accessing the abstract methods
		SuperClass obj2=new AbstractClass1();
		System.out.println(obj1.sumOfTwo(4,5));
		System.out.println(obj2.sumOfThree(2,3,9));
		obj1.disp();
		obj2.disp();		
	}
}
