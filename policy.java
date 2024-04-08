public class Policy
{
   private int policyNumber;
   private String providerName;
   public PolicyHolder policyHolder;
   
   public Policy()
   {
      policyNumber = 0;
      providerName = "BLANK";
      policyHolder = new PolicyHolder();
   }
   
   
   public Policy(int policyNumber, String providerName, PolicyHolder policyHolder)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
   }
   
   
   
  //getters and setters in order
  
   //@return policyNumber - users policy number
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   //@param users policy number
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   //@return name of provider company
   public String getProviderName()
   {
      return providerName;
   }
   
   //@param name of provider company
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
      
   //end of getters and setters
   
   
   
   //calculation methods
 
   //@param BMI Body mass index of holder
   //@return cost of policy for the holder
   public double policyPrice(double BMI)
   {
      if (policyHolder.getPolicyHolderAge() > 50)
      {
         if(policyHolder.getPolicyHolderSmoking().equals("smoker"))
         {
            if(BMI > 35)
            {
               return (775 + ((BMI - 35) * 20));
            }
            else
            {
               return 775;
            }
         }
         else if(BMI > 35)
         {
            return (675 + ((BMI - 35) * 20));
         }
         else
         {
            return 675;
         }
      }
      else if(policyHolder.getPolicyHolderSmoking().equals("smoker"))
      {
         if(BMI > 35)
         {
            return (700 + ((BMI - 35) * 20));
         }
         else
         {
            return 700;
         }
      }
      else if(BMI > 35)
      {
         return (600 + ((BMI - 35) * 20));
      }
      else
      {
         return 600;
      }
      
   }
   
   
   //display information for policy
   public String toString(){
      return "Policy Number: " + getPolicyNumber() + "\n" +
             "Provider Name: " + getProviderName() + "\n" +
             policyHolder.toString() +
             "Policy Price: $" + String.format("%,.2f", policyPrice(policyHolder.policyHolderBMI())) + 
             "\n";
      
   }
   
}