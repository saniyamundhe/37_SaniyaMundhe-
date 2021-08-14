public class JPR13{

    public static void main(String[] args) {

        float x= 1.20f;
         float y = 2.45f;

        System.out.println("Before swapping number ");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);

        // Value of x is assigned to temporary
        float temporary = x;

        // Value of y is assigned to first
        x= y;

        // Value of temporary (which contains the value of x) is assigned to y
        y = temporary;

        System.out.println("after swapping number");
        System.out.println("First number = " + x);
        System.out.println("Second number = " +y);
    }
} 
