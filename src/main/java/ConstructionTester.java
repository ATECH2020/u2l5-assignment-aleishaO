import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
         Scanner keyboard = new Scanner(System.in); 
        double taxRate; 
        int numBoards;
        int numWindows; 
        double lumber = 8;
        double windows =11 ;
  
       
   
         double total = 0;
        
         
         System.out.println("Enter the sales tax rate: ");
          taxRate = keyboard.nextDouble(); 
          System.out.println("How many boards do you need?"); 
         numBoards = keyboard.nextInt();
          System.out.println("How many windows do you need?"); 
         numWindows = keyboard.nextInt(); 
         double lumberCost = lumber ;
        double windowCost = windows;
        double taxes = taxRate;
         
          Construction c = new Construction( lumberCost,  windowCost,  taxes ); 
         
            total = c.windowCost(numWindows) + c.lumberCost( numBoards);
             System.out.println("Your total is:" + total);
              System.out.println("Your grand total is: " + c.grandTotal(total));
           
    }
}
