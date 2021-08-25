public class JPR23
{
public static void main (String [] args)
{
      Amazon az=new  Amazon ();
        az.show();
        
      Development d1=new         Development();
        d1.print();
        
        
       Design d2=new Design();
            d2.show();
                   
       Testing t1=new Testing();
            t1.print();
             
        Sales s1=new Sales();
              s1.print();
                 
          Account a1=new Account();
               a1.disp();       

} 
}

       class Amazon 
        {
        static String comp="Amazon";
          int emp=50000;
    
         void show()
        {
         System.out.println("Hiiii....This is " +comp);
          System.out.println("There are "+emp+" No of employees working in the  company ") ;
           }
        }


     class Development extends Amazon 
     {
       int emp=9000;
       void print ()
       {
       System.out.println ("There are Development department in "+comp+"  \nThere are "+emp+" employees working in the development dept") ;
       } 
      } 

      /*
      single inheritance
      Super class-Amazon
      child class- Development*/
      class Design extends Amazon
     {
      int emp=11000;
       void show ()
       {
      System.out.println ("There are Design department in "+comp+"  \nThere are "+emp+" employees working in the design dept") ;
     } 
    } 


     /*
    multilevel inheritance. 
   first super class-Amazon
   Second Super class-Design
   child class- testing*/
    
     class Testing extends Design
   {
      int emp=8000;
      void print ()
    {
      System.out.println ("There are Testing department in "+comp+"  \nThere are "+emp+" employees working in the testing dept") ;
     } 
  } 


    /*
    multilevel inheritance
    first super class-Amazon
    Second Super class-Testing
    child class- sales*/
 

     class Sales extends Testing
      {
         int emp=12000;
        void print ()
         {
          System.out.println ("There are selling department in "+comp+"  \nThere are "+emp+" employees working in the selling dept") ;
       } 
     } 


   /*
   hierarchical inheritance
   Super class-Amazon
   child class- Account*/

   class Account extends Amazon 
   {
       int emp=13000;
      void disp ()
     {
      System.out.println ("There are account department in "+comp+"  \nThere are "+emp+" employees working in the account dept") ;
       } 
    } 






