 package staticBlock; 
public class StaticBlockTest 
{ 
// Declare one instance blocks. 
   { 
     System.out.println("Instance block in class "); 
   } 
  
// Declare one static blocks. 
 static { 
    System.out.println("Static block in class"); 
 } 

// Declare zero parameter constructor. 

 StaticBlockTest()
 { 
   System.out.println("zero arguments constructor"); 
 } 

// Declare one parameter constructor with int parameter named s. 

 StaticBlockTest(int s)
 { 
   System.out.println(" one argument constructor"); 
 } 
public static void main(String[] args) 
{ 
// Create an object of class. 
      new StaticBlockTest();

// Create another object of class and pass an integer argument value. 
      new StaticBlockTest(20);  
 } 
}
