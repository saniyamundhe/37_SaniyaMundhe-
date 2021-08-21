
   public class Jpr22 {

        public static void main(String[] args) {
		
		Addition obj=new Addition ();
                 Subtraction obj1 = new Subtraction();
		
         //Method overloading
		System.out.println("Addition="+obj.add(23,12));
		System.out.println("Addition="+obj.add(13,14,15));
		System.out.println("Addition="+obj.add(88,78,4,34));
  
        System.out.println( "Subtraction=" +obj1.sub(23,12));
	 	System.out.println( "Subtraction=" +obj1.sub(14,6,5));
		System.out.println( "Subtraction=" +obj1.sub(56,34,45, 12));
 
 
		//Method overriding 
		Addition obj2=new Addition ();
		Addition obj3=new Subtraction ();
		Subtraction obj4= new Subtraction ();
		obj1.disp();
		obj2.disp();
		obj3.disp();	

	}// end main

}// end class


class Addition {
	int add(int a,int b)
	{
		return(a+b);
		
	}
	int add(int a,int b,int c)
	{
		return(a+b+c);
		
	}
	int add(int a,int b,int c,int d)
	{
		return(a+b+c+d);
		
	}
	void disp()
	{
		System.out.println("Heyy..... It's a superclass ");
	}
   }// end addition 

     //Subclass

    //Method overriding 
      class Subtraction extends Addition {
        int sub(int a,int b)
	{
		return(a-b);
		
	}
	int sub(int a,int b,int c)
	{
		return(a-b-c);
		
	}
	int sub (int a,int b,int c,int d)
	{
		return(a-b-c-d);
		
	}

	void disp()
	{
		System.out.println("Heyyy..... It's from subclass ");
	} 
	   
}//end subtraction 
