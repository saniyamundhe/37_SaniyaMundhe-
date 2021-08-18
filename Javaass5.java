public class Ass5
 {
public static void main(String[] args) 
{
int trainLen=340;
double speed=45.0; 
int tunnel=160; 

speed=(double) speed*(1000/3600.0);

int distance =tunnel+ trainLen;

double time= distance/speed; 

System.out.println(" Time required:" +time+" Sec");
}
} 
