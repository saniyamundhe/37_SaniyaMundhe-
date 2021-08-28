
abstract class Employee
{
	int id=25;
	String name="Saniya";
	String dept="IT";
	String comp="Computer Upgrading Service....";
	String Edu="Mtech ";
	long mob=9960921014l;
	String email="sanu@gmail.com";
	abstract public void print();
}

	
 class ID_card extends  Employee
{
	public void print()
	{
		System.out.println(".        ID card Of Employee");
		System.out.println("Company Name:"+comp);
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("ID: "+id);
		System.out.println("Name : "+name);
		System.out.println("Dept: "+dept);
		System.out.println("Education: "+Edu);
		System.out.println("Mob No.: "+mob);
		System.out.println("Email: "+email);
                System.out.println("-----------------------------------------");	
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		
          ID_card ID=new ID_card();
          ID.print();
	}
}
