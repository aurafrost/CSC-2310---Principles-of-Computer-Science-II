import java.util.*;

public class Driver
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    double l = -1;
    double w = -1;
    
    while(l<0)
    {
      System.out.println("Enter length:");
      l = keyboard.nextDouble();
    }
    
    while(w<0)
    {
      System.out.println("Enter width:");
      w = keyboard.nextDouble();
    }
    
    Rectangle rec = new Rectangle(l,w);
    
    System.out.println("Your length is: " + l);
    System.out.println("Your width is: " + w);
    System.out.println("The area is: " + rec.getArea());
    System.out.println("The perimeter is: " + rec.getPerimeter());
  }
}