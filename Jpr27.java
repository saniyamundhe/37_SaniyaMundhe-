public class JPR27 {

	public static void main(String[] args) {
		
       Robot robo=new Robot ();
       robot ro=new robot ();
       ro.show();
       robo.Price();
       robo. method();
       robo.method1();
      robo.method2();
    
		
	}//end main

}//end Jpr27


interface robot1
{

	String Robo1="Robot Systems Technology Branch";

		
} 

interface robot2 extends robot1
{
	
}


interface robot3 extends robot2, robot1 
{
	
	void method ();
	void method1();
	void method2();

}

class Robot implements robot3
{

	   final int cost; //final blank variable
       String name="Robonaut";
        Robot ()
    	{
        cost =100000;
		 // initialization of final blank variable
      	}
      	
  	final void Price()
   	{
		System.out.println("Price of the robot is:"+cost);
 	}
	// Override all methods 
	 public void method()
	{
		System.out.println(""+name+ " robot perceive the environment using sensors" );
	}
	public void method1()
	{
			System.out.println(""+name+"its hands and fingers move like a person's....");
	}
	public void method2()
	{
		System.out.println(""+name+"it contain 84 sensors  feedback and control, 60 of which are analog and require signal conditioning and digitization " );
	}
			
}//end Robot

class robot extends Robot 
{

	void show()
	{
		System.out.println("Features of the "+name+" robot........!!!!");
	}
	
	
} 
