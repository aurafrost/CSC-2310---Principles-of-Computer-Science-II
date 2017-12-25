//Jimmy Tran
import java.util.*;
public class array_list
{
  public static void main(String[]args)
  {
    Scanner keyboard = new Scanner(System.in); //sets keyboard for user input
    int size = 0; //sets default size of the array list
    
    while(size<50) //loops the comment below as long as the size is below the minimum
    {
      System.out.println("Enter the size of the array list (Minimum: 50)"); //prompts for size input
      size = keyboard.nextInt(); //sets the size as the next int the user inputs
    }
    ArrayList <Integer> a = new ArrayList <Integer>(size); //creates an array list reserving the specified size
    
    a.add((int)Math.ceil(Math.random()*1000)); //adds a value at index zero in the array list
    for(int i = 1; i < size; i++) //loop for adding values until the size is reached
    {
      int current = (int) Math.ceil(Math.random()*1000); //creates and stores a random value between 1 and 1000
      a.add(i,current); //adds the value at the end of the array list
      for(int j = i; j > 0; j--) //loops backward through the array list to move a value into its correct position
      {
        if(a.get(j) < a.get(j-1)) //checks if the current index number is less than the one before it
        {
          a.set(j,a.get(j-1)); //replaces the number in the current index with the one before it if it is smaller
          a.set(j-1,current); //sets the previous index as the stored random value
        }
      }
    }
    System.out.println(a.toString()); //prints the sorted array list in string format
  }
}