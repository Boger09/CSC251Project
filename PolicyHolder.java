public class PolicyHolder
{
   private String policyHolderFirstName;
   private String policyHolderSecondName;
   private int policyHolderAge;
   private String policyHolderSmoking;
   private int policyHolderHeight;
   private int policyHolderWeight;
   private int BMI;
   
   public PolicyHolder()
   {
      policyHolderFirstName = "BLANK";
      policyHolderSecondName = "BLANK";
      policyHolderAge = 0;
      policyHolderSmoking = "non-smoker";
      policyHolderHeight = 0;
      policyHolderWeight = 0;
   }
   
   
   public PolicyHolder(String policyHolderFirstName, String policyHolderSecondName, int policyHolderAge, String policyHolderSmoking, int policyHolderHeight, int policyHolderWeight)
   {
      this.policyHolderFirstName = policyHolderFirstName;
      this.policyHolderSecondName =  policyHolderSecondName;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderSmoking = policyHolderSmoking;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
   }
   
   
   
  //getters and setters in order
  
   //@return holders first name
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   //@param holders first name
   public void setPolicyHolderFirstName(String policyHolderFirstName)
   {
      this.policyHolderFirstName = policyHolderFirstName;
   }
   
   //@return holders last name
   public String getPolicyHolderSecondName()
   {
      return policyHolderSecondName;
   }
   
   //@param holders last name
   public void setPolicyHolderSecondName(String policyHolderSecondName)
   {
      this.policyHolderSecondName = policyHolderSecondName;
   }
   
   //@return holders age
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   //@param holders age
   public void setPolicyHolderAge(int policyHolderAge)
   {
      this.policyHolderAge = policyHolderAge;
   }
   
   //@return if policy holder smokes
   public String getPolicyHolderSmoking()
   {
      return policyHolderSmoking;
   }
   
   //@param if policy holder smokes
   public void setPolicyHolderSmoking(String policyHolderSmoking)
   {
      this.policyHolderSmoking = policyHolderSmoking;
   }
   
   //@return holders height
   public int getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   //@param holders height
   public void setPolicyHolderHeight(int policyHolderHeight)
   {
      this.policyHolderHeight = policyHolderHeight;
   }
   
   //@return holders weight
   public int getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   //@param holders weight 
   public void setPolicyHolderWeight(int policyHolderWeight)
   {
      this.policyHolderWeight = policyHolderWeight;
   }
   
   
   //end of getters and setters
   
   
   
   //calculation methods
   
   //@return Body Mass Index of holder
   public double policyHolderBMI()
   {
      return (((double)policyHolderWeight * 703) / ((double)policyHolderHeight * (double)policyHolderHeight));
   }
      
   
   //display information for policy holder
   public String toString(){
      return "Policyholder’s First Name: " + getPolicyHolderFirstName() + "\n" +
             "Policyholder’s Last Name: " + getPolicyHolderSecondName() + "\n" +
             "Policyholder’s Age: " + getPolicyHolderAge() + "\n" +
             "Policyholder’s Smoking Status: " + getPolicyHolderSmoking() + "\n" +
             "Policyholder’s Height: " + getPolicyHolderHeight() + " inches" + "\n" +
             "Policyholder’s Weight: " + getPolicyHolderWeight() + " pounds" + "\n" +
             "Policyholder’s BMI: " + String.format("%,.2f", policyHolderBMI()) +
             "\n";
   }
   
}
