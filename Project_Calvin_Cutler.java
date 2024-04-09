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

         int policyNumber = inputFile.nextInt(); //policy number input
         
         inputFile.nextLine(); //Scanner reset

         String providerName = inputFile.nextLine(); //policy holder provider name input

         String policyHolderFirstName = inputFile.nextLine(); //policy holder first name input

         String policyHolderLastName = inputFile.nextLine(); //policy holder last name input

         int policyHolderAge = inputFile.nextInt(); //policy holder age input

         inputFile.nextLine(); //Scanner reset 

         String policyHolderSmokingStatus = inputFile.nextLine(); //policy holer smoking status input
   

         int policyHolderHeight = inputFile.nextInt(); //policy holder height input
         

         int policyHolderWeight = inputFile.nextInt(); //policy holder weight input
      
         //initalize the policy
         Policys.add(new Policy(policyNumber, providerName, new PolicyHolder(policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight)));
         Policy.policyCount += 1;
      }
      inputFile.close();   
            
      //displays each policy holders information
      for (int i = 0; i < Policys.size(); ++i){
         System.out.println(Policys.get(i).toString());
         if(Policys.get(i).policyHolder.getPolicyHolderSmoking().equals("smoker"))
         {
            totalSmokers += 1;
         }
         else
         {
            totalNonSmokers += 1;
         }
         
         
      }
      //total smoking stats
      System.out.println("There were " + Policy.policyCount + " Policy objects created.");
      System.out.println("");
      System.out.println("The Number of policies with a smoker is: " + totalSmokers);
      System.out.println("The Number of policies with a non-smoker is: " + totalNonSmokers);
   }
}