//Jimmy Tran
import java.util.*;
public class search{
  public static void Seq_search(int[]a, int target){ //sequential search method
    double start = System.nanoTime();
    for(int i = 0; i < a.length;i++){
      if(a[i] == target){
        double searchTime = (System.nanoTime()-start)/1000000000;
        System.out.println("Sequential search time for " + target + ": " + searchTime + " seconds.");
        i=a.length-1;
        break; //stops the loop just in case
      }
      else{
        if(i==a.length-1 && a[a.length-1]!=target){ //checks two conditions to ensure method is finished
          double searchTime = (System.nanoTime()-start)/1000000000;
          System.out.println("Target not in array. Sequential search time for "+target+": "+searchTime+" seconds.");
        }
      }
    }
  }
  
  public static void Bin_search(int[]b, int target){ //binary search method
    int max = b.length-1;
    int min = 0;
    boolean found = false;
    while(min <= max){
      int mid = (max+min)/2;
      if(target > b[mid]){
        min = mid + 1;
      }
      else{
        if(target < b[mid]){
          max = mid - 1;
        }
        else{
          if(b[mid]==target){
            System.out.print("Binary search time for " + target + ": ");
            found = true; //causes second outer if condition to fail
            break; //breaks out of loop in case
          }
        }
      }
    }
    if(found==false){//if target is not found, prints this instead
      System.out.print("Target not in array. Binary search time for " + target + ": ");
    }
  }
  
  public static void BinRe_search(int[]c, int target, int lowEnd, int highEnd){ //binary recursive search
    int mid = (highEnd+lowEnd)/2;
    int check = 0; //used to stop the second set of if statements if target is outside the extremes of the array
    if(target > c[highEnd] || target < c[lowEnd]){ //checks if target is > highest or < lowest value in array
      check = -1;
      System.out.print("Target not in array. Binary search time for " + target + ": ");
    }
    if(lowEnd <= highEnd && highEnd != 0 && check==0){
      if(target > c[mid]){
        BinRe_search(c, target, mid+1, highEnd);
      }
      else{
        if(target < c[mid]){
          BinRe_search(c, target, lowEnd, mid-1);
        }
        else{
          if(c[mid]==target){
            System.out.print("Binary recursion search time for " + target + ": ");
          }
        }
      }
    }
  }
  
  public static void main(String [] args){ //main method
    //sets size of the arrays, only allowing values of 100 or higher
    Scanner keyboard = new Scanner(System.in);
    int size = 0;
    while(size<=100)
    {size = keyboard.nextInt();}
    
    //initializes and sets random values from 1-99 into array a
    int [] a = new int [size];
    for(int i = 0; i < size; i++)
    {a[i] = (int) Math.ceil(Math.random()*99);}
    
    //initializes and sets random values from 1-99 into array b
    int [] b = new int [size];
    for(int i = 0; i < size; i++)
    {b[i] = (int) Math.ceil(Math.random()*99);}
    
    //initializes and sets random values from 1-99 into array c
    int [] c = new int [size];
    for(int i = 0; i < size; i++)
    {c[i] = (int) Math.ceil(Math.random()*99);}
    
    //call the seq_search method three times on array a
    System.out.println("Sequential Searches for 1, 50, and 100:");
    Seq_search(a,1);
    Seq_search(a,50);
    Seq_search(a,100);
    System.out.println();
    
    //sorts array b while timing
    System.out.println("Binary Searches for 1, 50, and 100:");
    double sortStart = System.nanoTime();
    Arrays.sort(b);
    double sortTime = (System.nanoTime()-sortStart)/1000000000;
    
    //times and calls the bin_search method three times
    //bin_search for 1
    double searchStart = System.nanoTime();
    Bin_search(b,1);
    double totalTime = (System.nanoTime()-searchStart)/1000000000+sortTime;
    System.out.println(totalTime+" seconds.");
    //bin_search for 50
    searchStart = System.nanoTime();
    Bin_search(b,50);
    totalTime = (System.nanoTime()-searchStart)/1000000000+sortTime;
    System.out.println(totalTime+" seconds.");
    //bin_search for 100
    searchStart = System.nanoTime();
    Bin_search(b,100);
    totalTime = (System.nanoTime()-searchStart)/1000000000+sortTime;
    System.out.println(totalTime+" seconds.");
    System.out.println();
    
    //sorts array c while timing
    System.out.println("Recursive Binary Searches for 1, 50, and 100:");
    sortStart = System.nanoTime();
    Arrays.sort(c);
    sortTime = (System.nanoTime()-sortStart)/1000000000;
    //BinRe_search for 1
    searchStart = System.nanoTime();
    int highEnd = c.length-1;
    BinRe_search(c, 1, 0, highEnd);
    totalTime = (System.nanoTime()-searchStart)/1000000000+sortTime;
    System.out.println(totalTime+" seconds.");
    //BinRe_search for 50
    searchStart = System.nanoTime();
    BinRe_search(c, 50, 0, highEnd);
    totalTime = (System.nanoTime()-searchStart)/1000000000+sortTime;
    System.out.println(totalTime+" seconds.");
    //BinRe_search for 100
    searchStart = System.nanoTime();
    BinRe_search(c, 100, 0, highEnd);
    totalTime = (System.nanoTime()-searchStart)/1000000000+sortTime;
    System.out.println(totalTime+" seconds.");
    
    //Analysis
    //The sequential search method is array-size and luck-dependent. The user may find a given value in no time
    //or never depending on where the desired target's location is. As such it is a poor search method to
    //use especially given a larger array or range to search. The binary search using a loop is the
    //best overall search to use as it is quick and more efficient than checking every single location in
    //an array. It is the best solution to use in most cases although its coding can look messy. 
    //The recursive binary search looks the neatest though and if done correctly and used in the
    //right circumstance is much faster and more efficient than the other two. It is better than binary search
    //but in some cases will be a little slower as it calls itself multiple times and will not work for more
    //complex search algorithms. It is also more difficult to code than binary search without proper
    //knowledge of recursion.
  }
}