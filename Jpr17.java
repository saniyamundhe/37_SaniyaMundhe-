public class JPR17
 {

public static void main(String[] args)
 {

int p=161258; // principle
Float r=0.05f;//rate of interest
int n=3; // time 
double si, ci ;

//Simple interest=(p*r*t)/(100*12)

si=(p*r*n)/(100/12);
System.out.println(" simple interest will be:" +si);

//compound Interest =p*((1+ 0.05 / 12)^12) (12 *1) -p

ci=p*Math.pow(1-(r/12), 12)-p;
System.out.println("compound interest will be:"
+ci);
}
}
