import java.util.Scanner; //allows keyboard to be imported for use

public class Driver {
  
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in); //allows user keyboard input
    String repeat = "YES";

    while(repeat.equalsIgnoreCase("YES")){ //loops the program if the user responds with "yes" to the question below
      System.out.println("Enter Fraction 1 in the format num/denom:"); //prompts for fraction 1
      String frac1 = keyboard.nextLine();
      int n = frac1.indexOf("/");
      int length = frac1.length();
      int a = Integer.parseInt(frac1.substring(0,n)); //converts the first part of the string to an int
      int b = Integer.parseInt(frac1.substring(n+1,length)); //converts the second part of the string to an int
      Fraction f1 = new Fraction(a,b); //instantiates fraction 1 using the given string
      
      System.out.println("Enter Fraction 2 in the format num/denom:"); //prompts for fraction 2
      String frac2 = keyboard.nextLine();
      int n2 = frac2.indexOf("/");
      int length2 = frac1.length();
      int c = Integer.parseInt(frac2.substring(0,n2)); //converts the first part of the string to an int
      int d = Integer.parseInt(frac2.substring(n2+1,length2)); //converts the second part of the string to an int
      Fraction f2 = new Fraction(c,d); //instantiates fraction 2 using the given string
    
      System.out.println("The two fractions are: " + a + "/" + b + " and " + c + "/" + d); //returns the two fractions
      System.out.println("The two fractions added equal: " + f1.addFrac(f2)); //returns the added fraction
      System.out.println("The two fractions subtracted equal: " + f1.subtractFrac(f2)); //returns the difference in fractions
      System.out.println("The two fractions multiplied equal: " + f1.multiplyFrac(f2)); //returns the multiplied fraction
      System.out.println("The two fractions divided equal: " + f1.divideFrac(f2)); //returns the divided fraction
    
      repeat = "N/A";
      while(repeat.equals("N/A")){ //allows the loop to repeat if the user inputs unexpected answers
        System.out.println("Run program again? (YES or NO)"); //prompts user for repeating the program
        repeat = keyboard.nextLine();
        if (repeat.equalsIgnoreCase("no")){ 
          System.exit(0); //terminates the program if user inputs "no" in any form
        }
        else{ 
          if (repeat.equalsIgnoreCase("yes")){
            repeat = "YES";
          }
          else{
            repeat = "N/A"; //changes any input other than "yes" or "no" to "N/A" causing the question to be repeated
          }
        }
      }
    }
  }
}