import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner keyboard = new Scanner(System.in);
       double lat1;
       double lat2;
       double long1;
       double long2;
       System.out.println("Enter the latitude of the starting location: ");
       lat1 = keyboard.nextDouble();
       System.out.println("Enter the longitude of the starting location:");
       long1 = keyboard.nextDouble();
       System.out.println("Enter the latitude of the ending location: ");
       lat2 = keyboard.nextDouble();
       System.out.println("Enter the longitude of the ending location:");
       long2 = keyboard.nextDouble();
        double a = lat1; 
       double b = long1;
       GeoLocation e = new GeoLocation(a,b);
       
       System.out.print("The distance is " + e + " miles");
    }
}