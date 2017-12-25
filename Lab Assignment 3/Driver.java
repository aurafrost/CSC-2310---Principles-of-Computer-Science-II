import java.util.*;
public class Driver
{
  public static void main(String[]args)
  {
    ArrayList <Integer> a = new ArrayList <> (50);
    ArrayList <Integer> b = new ArrayList <> (50);
    Combine s = new Combine(a, b);
    s.intersect(a,b);
    System.out.print(s.toString());
  }
}