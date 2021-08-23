public class JPR23
 {

	public static void main(String[] args)
{
		
		Student s1=new Student();
		Student s2=new Student("Saniya","TYCO","A","23-10-2020","akola","saniya@gmail.com",9960921014l);
		
		
		//admit student
		s2.admit();
		//change the address
		s2.changeadd("sangola");
		//change the  email
		s2.changeEmail("sanu@gmail.com");
		//change the mobile number
		s2.changemob(9871474l);
		s2.disp();
	}
	

}
class Student
    {
       static String collage="spc";
	  String name;
	  String cls;
	  String div;
	  String admdate;
	  String address;
	  String email;
	  long mobile;
	 
	   //default constructor
	  Student()
	  {
		  System.out.println(" This is Default constructor...");
	  }
	
	  Student(  String name,String cls,String div,String admdate,String address,String email,long mobile)
	  {
	  	
		 this.name=name;
		 this.cls=cls;
		 this.div=div;
		 this.admdate=admdate;
		 this.address=address;
		 this.email=email;
		 this.mobile=mobile;
		 
		 
	  } 
	  
	  void admit()
	  {
		  System.out.println("You are admited in= " +collage);
	 
	  
 	  }
	  void terminate()
	  {
		  System.out.println("You are terminated from " +collage);
		  
	  }
	  void changeDiv(String dv)
	  {
		  div=dv;
		  System.out.println("After changing division="+div);
		  
	  }
	  
	  void changeEmail(String eml)
	  {
		  email=eml;
		  System.out.println("After changing email address="+email);
		  
	  }
	  void changeadd(String add)
	  {
		  address=add;
		  System.out.println("After changing adreess="+address);
		  
	  }
	  void changemob(long mobNo)
	  {
		  mobile=mobNo;
		  System.out.println("After changing mobile number="+mobile);
		  
	} 
          void disp() 
              {
                  System.out.println("Name of student is= "+name);
		  System.out.println("Class of student is= "+cls);
		  System.out.println("Mobile number of student is= "+mobile);
		  System.out.println("Email of student is= "+email);
		  System.out.println("Address of student is= "+address);
		  System.out.println("Admission date of student is= "+admdate); 
            } 
	 
    
    }




 
