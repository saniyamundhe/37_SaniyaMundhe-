public class JPR25 {
	public static void main(String[] args) {
		
		Arithmetic ar= new solution ();
		ar.add();
		ar.sub();
		ar.mul();
		ar.div();
		ar.mod();
	}//end main

}//end class

 abstract class Arithmetic 
{
	 int a=60;
	 int b=70;
	 //abstract methods
	public abstract void add();
	public abstract void sub();
	public abstract void mul();
	public abstract  void div();
	public abstract void mod();
}// end arithmetic 

class solution extends Arithmetic 
{
	public void add()
	{
	 System.out.println("Addition is "+(a+b));
	}
	public void sub()
	{

		 System.out.println("Substraction is "+(a-b));
	}
	public void mul()
	{

		 System.out.println("Multiplication is "+(a*b));
	}
	public void div()
	{

		 System.out.println("Division is "+(a/b));

	}
	public void mod()
	{

		 System.out.println("Modulation is "+(a%b));

	}

}
