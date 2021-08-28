
// creating interface
interface Area
{ 
      double length=10;
      double width=20;
    	void Area();
}

class Area1
{
	final double pi=3.14;
	double a;
	double r;
}

class Triangle extends Area1 implements Area
{
	  //override interface method
	public void Area()
	{
		a=(length*width)/2;
		System.out.println("Area of Triangle is "+a);
		
	}
}


class Pentagon extends Area1 implements Area
{
	float s;// side of the pentagon
	float a; // apothem length
	Pentagon( )
	{
		s=29;
		a=21;
	}
	  //override interface method
	public void Area()
	{
		
		a=(5/2)*s*a;
		System.out.println("Area of Pentagon is "+a);
	}
}
 
class Rectangle extends Area1 implements  Area
{
     //override interface method
	public void Area()
	{
		a=length*width;
		System.out.println("Area of Rectangle is "+a);
	}
}

class Circle extends Area1 implements Area
 { 
   double r=5;
	  //override interface method
	public void Area()
	{
		a=pi*r*r;
		System.out.println("Area of Circle is "+a);
		
	}	
}


class Hexagon extends Area1 implements Area
{
	double s=7; //side of tha Hexagon 
   final double rt=(3*Math.sqrt(3))/2; 
	  //override interface method
	public void Area()
	{
		a=rt*s*s;
		System.out.println("Area of Hexagon is "+a);
		
	}
}

class Trapezium extends Area1 implements Area
{
	double h;//height 
	double s1;//length of parallel side
	double s2;//length of parallel side
	Trapezium(double h,double s1,double s2)
	{
		this.h=h;
		this.s1=s1;
		this.s2=s2;
	}
	  //override interface method
	public void Area()
	{
		a=((s1+s2)*h)/2;
		System.out.println("Area of Trapezium is "+a);
		
	}
	
}

//abstract class
abstract class area
{
    final float PI=3.14f; //final variable
    abstract public void area();
}
class Oval extends area{
    int x,y;
    float a;
    float pi=3.14f;

    Oval(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public void area() {
        a=x*y*pi;
        System.out.println("Area of Oval is : "+a);
    }
    
    void show()
    {
    System.out.println("Here is the Areas of the Geometric shapes....!!");
    }
    
}
   public class ass_1
    {
      public static void main(String[] args) 
      {
		

         Triangle  t= new Triangle();
             t.Area();
          Pentagon p = new Pentagon();
             p.Area();
         Rectangle r = new Rectangle();
              r.Area();
          Circle c = new Circle();
             c.Area();
       
        Hexagon h = new Hexagon();
             h.Area();
         Trapezium tr = new Trapezium(8,8,6);
             tr.Area();
         Oval o=new Oval(3,4);
             o.area();
             o.show();      
	}
}

 
