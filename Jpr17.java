
public class JPR17 {
    public static void main(String[] args) {
        int amount=161258;
        float si,ci;
        //simple interest calculating
        si=((amount*0.05f*1)/100)/12;
        System.out.println("Monthly Simple interest on amount "+amount+" is: "+si);
        //compund interest calculating
        float rate=(1+(5.0f/100));
        ci=(amount*rate-amount)/12;
        System.out.println("Monthly Simple interest on amount "+amount+" is: "+ci);


    }
}
