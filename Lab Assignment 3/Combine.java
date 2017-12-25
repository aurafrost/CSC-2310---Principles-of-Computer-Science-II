import java.util.*;
public class Combine
{
  ArrayList <Integer> a = new ArrayList <> (50);
  ArrayList <Integer> b = new ArrayList <> (50);
  ArrayList <Integer> c = new ArrayList <> (60);
  
  
  public Combine(ArrayList a, ArrayList b, ArrayList c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  
  public ArrayList intersect(ArrayList a, ArrayList b, ArrayList c)
  {
    for(int i = 0; i < 50;i++)
    {
      a.add(i,(int) Math.ceil(Math.random()*20));
      b.add(i,(int) Math.ceil(Math.random()*20));
    }
    Collections.sort(a);
    Collections.sort(b);
    for(int j = 0; j < a.size(); j++)
    {
      for(int k = 0; k < b.size(); k++)
      {
        if(a.get(j)==b.get(k))
        {
          c.add(a.get(j));
          a.remove(a.get(j));
          j=0;
          b.remove(b.get(k));
          k=0;
        }
      }
    }
    return c;
  }
  
  
  public static void main(String[]args)
  {
    ArrayList <Integer> a = new ArrayList <> (50);
    ArrayList <Integer> b = new ArrayList <> (50);
    ArrayList <Integer> c = new ArrayList <> (60);
    Combine s = new Combine(a, b, c);
    s.intersect(a,b,c);
    System.out.println("List A: " + a.toString());
    System.out.println();
    System.out.println("List B: " + b.toString());
    System.out.println();
    System.out.println("List C: " + c.toString());
  }
}