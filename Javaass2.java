public class Ass2 
{

public static void main(String[] args) 
{

  String x="23/10/2003";

 String dd=x.split("/")[0];//extract date
 String mm=x.split("/")[1];// extract month 
 String yyyy=x.split("/")[2];// extract year

 System.out.println("Year "+yyyy);
}
} 
