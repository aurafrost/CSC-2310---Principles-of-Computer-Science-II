import java.util.*;

public class Driver
{
  public static void main(String[]args)
  {
    //sets keyboard for input
    Scanner keyboard = new Scanner(System.in);
    
    //initializes a vaiable that reverts to default setting if user does not input a valid variable in the loop
    String answer = "N/A";
    
    //asks for user input of sport type and repeats outputs if input is invalid
    while(answer.equalsIgnoreCase("N/A"))
    {
      System.out.println("My favorite sports player play basketball, soccer, and tennis.");
      System.out.println("Which of my favorite sports players would you like to know about?");
      System.out.println("Enter the corresponding sport (Basketball, Soccer, or Tennis).");
      answer = keyboard.nextLine();
      //checks which sport was entered, initializes the subclass, and prints out stats of the sports player
      //otherwise sets answer back to default and loops the program
      if(answer.equalsIgnoreCase("Basketball"))
      {
        BasketballPlayer bPlayer = new BasketballPlayer("Michael Jordan",12,"$1,030,000","6\'6\"",32292,6672,5633);
        System.out.println("Favorite Player Name: " + bPlayer.getName());
        System.out.println("Jersey Number: " + bPlayer.getNumber());
        System.out.println("Salary: " + bPlayer.getSalary());
        System.out.println("Height: " + bPlayer.getHeight());
        System.out.println("Points Scored: " + bPlayer.getPoints());
        System.out.println("Rebounds: " + bPlayer.getRebounds());
        System.out.println("Assists: " + bPlayer.getAssists());
      }
      else if(answer.equalsIgnoreCase("Soccer"))
      {
        SoccerPlayer sPlayer = new SoccerPlayer("David Beckham", 23 ,"$47,200,000" ,"Midfielder", 15, 10);
        System.out.println("Favorite Player Name: " + sPlayer.getName());
        System.out.println("Jersey Number: " + sPlayer.getNumber());
        System.out.println("Salary: " + sPlayer.getSalary());
        System.out.println("Position: " + sPlayer.getPosition());
        System.out.println("Most Assists in a Season: " + sPlayer.getAssists());
        System.out.println("Most Yellow Cards in a Season: " + sPlayer.getCards());
      }
      else if(answer.equalsIgnoreCase("Tennis"))
      {
        //tennis players actually do not have a jersey number and as such, the zero is just a placeholder
        TennisPlayer tPlayer = new TennisPlayer("Roger Federer", 0 ,"$7.7 Million", 2, "Right-handed Backhand", 84);
        System.out.println("Favorite Player Name: " + tPlayer.getName());
        System.out.println("Salary: " + tPlayer.getSalary());
        System.out.println("Current World Rank: " + tPlayer.getRank());
        System.out.println("Play Style: " + tPlayer.getStyle());
        System.out.println("Titles Held in the Open Era: " + tPlayer.getTitles());
      }
      else
      {
        answer = "N/A";
      }
    }
  }
}