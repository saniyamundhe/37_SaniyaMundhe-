public class VoterAgeLimit
    {
    
     void Eligibility (int age){
        try{
            if(age>18){
                System.out.println("Voter are eligible to vote...");
            }
            else{
                
                System.out.println("Voter are not eligible to vote");
            }
        }
        catch (Exception e){
            System.out.println("Exception occured..." +e);
        }
            
      finally
      {
        System.out.println("Age must be greater than 18 for voting");
        }
    }
    public static void main(String[] args) {
        VoterAgeLimit obj=new VoterAgeLimit();
        obj.Eligibility (22);
    }
}
