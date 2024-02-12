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
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
     
   public String getProviderName()
   {
      return providerName;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
 
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   public void setPolicyHolderFirstName(String policyHolderFirstName)
   {
      this.policyHolderFirstName = policyHolderFirstName;
   }

   public String getPolicyHolderSecondName()
   {
      return policyHolderSecondName;
   }
   
   public void setPolicyHolderSecondName(String policyHolderSecondName)
   {
      this.policyHolderSecondName = policyHolderSecondName;
   }
   
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   public void setPolicyHolderAge(int policyHolderAge)
   {
      this.policyHolderAge = policyHolderAge;
   }

   public String getPolicyHolderSmoking()
   {
      return policyHolderSmoking;
   }
   
   public void setPolicyHolderSmoking(String policyHolderSmoking)
   {
      this.policyHolderSmoking = policyHolderSmoking;
   }
   
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   public void setPolicyHolderHeight(double policyHolderHeight)
   {
      this.policyHolderHeight = policyHolderHeight;
   }

   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   public void setPolicyHolderWeight(double policyHolderWeight)
   {
      this.policyHolderWeight = policyHolderWeight;
   }
   
   
   //end of getters and setters
   
   
   
   //calculation methods
   public double policyHolderBMI()
   {
      return ((policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight));
   }
   
   
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