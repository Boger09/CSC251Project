import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Calvin_Cutler
{

   public static void main(String[] args) throws IOException
   {  
   
      //variables
      int totalSmokers = 0;
      int totalNonSmokers = 0;
      
      //array list creation
      ArrayList<Policy> Policys = new ArrayList<Policy>();
      
      
      //file open
      File policyInformation = new File("policyInformation.txt");
      
      //Scanner object creation
      Scanner inputFile = new Scanner(policyInformation); //scanner with file as argument
      
      //user input for policy
      
      while(inputFile.hasNext()) //keep going until end of file
      {
         System.out.print("Policy Number: ");
         int policyNumber = inputFile.nextInt();
         
         inputFile.nextLine(); //reset
         System.out.println("");
      
         System.out.print("Provider Name: ");
         String providerName = inputFile.nextLine();
      
         System.out.println("");
      
         System.out.print("Policyholder's First Name: ");
         String policyHolderFirstName = inputFile.nextLine();
         
         System.out.println("");

         System.out.print("Policyholder's Last Name: ");
         String policyHolderLastName = inputFile.nextLine();
         
         System.out.println("");
         
         System.out.print("Policyholder's Age: ");
         int policyHolderAge = inputFile.nextInt();
         
         System.out.println("");

         System.out.print("Policyholder's Somking Status (smoker/non-smoker): ");
         String policyHolderSmokingStatus = inputFile.nextLine();
   
         System.out.println("");
         inputFile.nextLine(); //reset
         
         System.out.print("Policyholder's Height (in inches): ");
         int policyHolderHeight = inputFile.nextInt();
         
         System.out.println("");
      
         System.out.print("Policyholder's Weight (in pounds): ");
         int policyHolderWeight = inputFile.nextInt();
         
         System.out.println("");
      
         //initalize the policy
         Policys.add(new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight));
         
      }
      inputFile.close();
      System.out.println("SPACE");
      System.out.println("SPACE");
      System.out.println("SPACE");
            
      //displays each policy holders information
      for (int i = 0; i < Policys.size(); ++i){
         Policys.get(i).display();
         if(Policys.get(i).getPolicyHolderSmoking().equals("smoker"))
         {
            totalSmokers += 1;
         }
         else
         {
            totalNonSmokers += 1;
         }
         
         
      }
      //total smoking stats
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
   }
}