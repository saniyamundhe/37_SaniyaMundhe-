class ExceptionHandling
{
  int a=10;
  int b=0;
  int c;
void arithOpera() 
{
     //Try block
     try
     {
     	c=a/b;
        System.out.println("Solution is:" +c);
     }
     //multi catch block 
     catch(ArithmeticException e)
{
	System.out.println("Arithmetic Exception" +e);
}
 catch(Exception e)
 {
 	System.out.println("Divide by zero....." +e);
 }
 //finally block
 finally
 {
 	System.out.println("finally block executed.....");
}
}

public static void main(String[] args) 
{ 
   ExceptionHandling obj =new ExceptionHandling() ;
    obj.arithOpera() ;
}//end main
}// end class
