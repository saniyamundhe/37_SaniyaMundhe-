public class JPR26 {

	public static void main(String[] args) {
		
		 myinterface mi=new  newinterface ();
		 mi.add();
		 mi.sub();
		 mi.mul();
		 mi.div();
		 mi.mod();
	}

}
interface myinterface
{

	final int a=65;
	final int b=30;
	public void add();
	public void sub();
	public void mul();
	public void div();
	public void mod();
}
 

class newinterface implements myinterface
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
	
