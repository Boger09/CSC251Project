import java.util.Scanner;

public class Project_Calvin_Cutler
{

   public static void main(String[] args)
   {  
      //Scanner object creation
      Scanner input = new Scanner(System.in);
      
      //user input for policy
      
      System.out.print("Please enter the Policy Number: ");
      int policyNumber = input.nextInt();
      
      input.nextLine();
      System.out.println("");
      
      System.out.print("Please enter the Provider Name: ");
      String providerName = input.nextLine();
      
      System.out.println("");
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String policyHolderFirstName = input.nextLine();
      
      System.out.println("");
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String policyHolderLastName = input.nextLine();
      
      System.out.println("");
      
      System.out.print("Please enter the Policyholder's Age: ");
      int policyHolderAge = input.nextInt();
      
      System.out.println("");
      
      System.out.print("Please enter the Policyholder's Somking Status (smoker/non-smoker): ");
      String policyHolderSmokingStatus = input.nextLine();
      
      input.nextLine();
      System.out.println("");
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double policyHolderHeight = input.nextDouble();
      
      System.out.println("");
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double policyHolderWeight = input.nextDouble();
      
      System.out.println("");
      
      Policy sample = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
      
      
      
      //display information
      System.out.println("Policy Number: " + sample.getPolicyNumber());
      System.out.println("");
      System.out.println("Provider Name: " + sample.getProviderName());
      System.out.println("");
      System.out.println("Policyholder’s First Name: " + sample.getPolicyHolderFirstName());
      System.out.println("");
      System.out.println("Policyholder’s Last Name: " + sample.getPolicyHolderSecondName());
      System.out.println("");
      System.out.println("Policyholder’s Age: " + sample.getPolicyHolderAge());
      System.out.println("");
      System.out.println("Policyholder’s Smoking Status: " + sample.getPolicyHolderSmoking());
      System.out.println("");
      System.out.println("Policyholder’s Height: " + sample.getPolicyHolderHeight() + " inches");
      System.out.println("");
      System.out.println("Policyholder’s Weight: " + sample.getPolicyHolderWeight() + " pounds");
      System.out.println("");
      System.out.println("Policyholder’s BMI: " + String.format("%,.2f",sample.policyHolderBMI()));
      System.out.println("");
      System.out.println("Policy Price: $" + String.format("%,.2f", sample.policyPrice(sample.policyHolderBMI())));
   }
   
}