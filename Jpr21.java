public class jpr21
 {
	public static void main(String[] args)
     {
	
                //creating an instance for class
		method me=new method();
		

		//invoking an instance method
 
              me.WithRetArg(50,25);
             me.WithRet();
             me.WithArg(16, 2);
             me.WoutArgRet(); 
		
             method obj=new method() ;
               obj.disp() ;
	} 
	

 }
  class method 
     {
        int a=20;
	int b=37;
	

        //method with return type and with   argument
	
	 int WithRetArg(int a , int b)
	{
	
		int c=a+b;
		System.out.println("Addition= "+c);
		return c; 
	}

	//method with return type and without argument 
	
	int WithRet()
	{
		int c=a-b;
		System.out.println("Substraction=" +c);
		return c;
	}


      //method without return type and with argument 
	
       void WithArg(int a ,int b)
 	{
		int c=a*b;
		System.out.println("multiplication=" +c);
		
	}


	//method without return type without argument
	void WoutArgRet()
	{
		float c=a/b;
		System.out.println("Division = "+c);
	}
	
	
    //static method
 
    static float mod() 
     {
    int x=10;  //local variable
    int y=60;
    float z=x%y;
    return z;
    } 

    void disp() //instance method
   {
        float s=mod() ;   //calling static method
        System.out.println( "Modulation ="  +s) ;
    }
	 	 	
 }

 
	 
    

