public class jpr18
{
public static void main(String[] args)
{		
int principle= 161258;
double rate=0.05d;

double EMI;
 int t1=3; //Time is 3 years
 int t2=5; //Time is 5 years
rate=rate/(12*100);
//The EMI generated for 3 years

t1=t1*12;

EMI= (principle*rate*Math.pow(1+rate,t1));
 System.out.print(" EMI for 3 years is= "+EMI); 

//The EMI generated for 5 years
t2=t1*12;

EMI= (principle*rate*Math.pow(1+rate,t2));
System.out.print(" EMI for 5 years is=" +EMI);
}
} 
