public class Policy
{
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderSecondName;
   private int policyHolderAge;
   private String policyHolderSmoking;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   public Policy()
   {
      policyNumber = 0;
      providerName = "BLANK";
      policyHolderFirstName = "BLANK";
      policyHolderSecondName = "BLANK";
      policyHolderAge = 0;
      policyHolderSmoking = "non-smoker";
      policyHolderHeight = 0;
      policyHolderWeight = 0;
   }
   
   
   public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderSecondName, int policyHolderAge, String policyHolderSmoking, double policyHolderHeight, double policyHolderWeight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolderFirstName = policyHolderFirstName;
      this.policyHolderSecondName =  policyHolderSecondName;
      this.policyHolderAge = policyHolderAge;
      this.policyHolderSmoking = policyHolderSmoking;
      this.policyHolderHeight = policyHolderHeight;
      this.policyHolderWeight = policyHolderWeight;
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
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   //@param holders height
   public void setPolicyHolderHeight(double policyHolderHeight)
   {
      this.policyHolderHeight = policyHolderHeight;
   }
   
   //@return holders weight
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   //@param holders weight 
   public void setPolicyHolderWeight(double policyHolderWeight)
   {
      this.policyHolderWeight = policyHolderWeight;
   }
   
   
   //end of getters and setters
   
   
   
   //calculation methods
   
   //@return Body Mass Index of holder
   public double policyHolderBMI()
   {
      return ((policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight));
   }
   
   
   //@param Body mass index of holder
   //@return cost of policy for the holder
   public double policyPrice(double BMI)
   {
      if (policyHolderAge > 50)
      {
         if(policyHolderSmoking.equals("smoker"))
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
      else if(policyHolderSmoking.equals("smoker"))
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

}