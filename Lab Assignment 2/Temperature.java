//Jimmy Tran
import java.util.*;
public class Temperature
{
  public static void main(String[]args)
  {
    double newTemp;
    Scanner keyboard = new Scanner(System.in);
    
    String type = "a";
    while(type.equals("a"))
    {
      System.out.println("Enter the temperature type to be converted. \"C\" for Celsius or \"F\" for Fahrenheit.");
      type = keyboard.nextLine();
      if(type.equalsIgnoreCase("f"))
      {
        type = "F";
      }
      else if(type.equalsIgnoreCase("c"))
      {
        type = "C";
      }
      else
      {
        type = "a";
      }
    }
    
    System.out.println("Enter the numerical temperature.");
    double t = keyboard.nextDouble();
    
    System.out.println("The given temperature is: " + t + " degrees " + type);
    
    if(type.equalsIgnoreCase("f"))
    {
      newTemp = 5*(t - 32)/9;
      System.out.println("The converted temperature is: " + newTemp + " degrees " + "C");
    }
    
    if(type.equalsIgnoreCase("c"))
    {
      newTemp = 9*t/5 + 32;
      System.out.println("The converted temperature is: " + newTemp + " degrees " + "F");
    }
  }
}