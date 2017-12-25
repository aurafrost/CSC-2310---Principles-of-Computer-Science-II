import java.*;

public class TennisPlayer extends SportsPlayer //this is a subclass of SportsPlayer
{
  protected int rank;
  protected String style;
  protected int titles;
  protected TennisPlayer(String name, int number, String salary, int rank, String style, int titles)
  {
    super(name, number, salary);
    this.name = name;
    this.number = number;
    this.salary = salary;
    this.rank = rank;
    this.style = style;
    this.titles = titles;
  }
  
  protected void setRank(int rank) //allows rank to be changed
  {
    this.rank = rank;
  }
  
  protected int getRank() //returns rank
  {
    return rank;
  }
  
  protected void setStyle(String style) //allows style to be changed
  {
    this.style = style;
  }
  
  protected String getStyle() //returns style
  {
    return style;
  }
  
  protected void setTitles(int titles) //allows titles to be changed
  {
    this.titles = titles;
  }
  
  protected int getTitles() //returns titles
  {
    return titles;
  }
}