import java.*;

public class BasketballPlayer extends SportsPlayer //this is a subclass of SportsPlayer
{
  protected String height;
  protected int points;
  protected int rebounds;
  protected int assists;
  protected BasketballPlayer(String name,int number,String salary,String height,int points,int rebounds,int assists)
  {
    super(name, number, salary);
    this.name = name;
    this.number = number;
    this.salary = salary;
    this.height = height;
    this.points = points;
    this.rebounds = rebounds;
    this.assists = assists;
  }
  
  protected void setHeight(String height) //allows height to be changed
  {
    this.height = height;
  }
  
  protected String getHeight() //returns height
  {
    return height;
  }
  
  protected void setPoints(int points) //allows points to be changed
  {
    this.points = points;
  }
  
  protected int getPoints() //returns points
  {
    return points;
  }
  
  protected void setRebounds(int rebounds) //allows rebounds to be changed
  {
    this.rebounds = rebounds;
  }
  
  protected int getRebounds() //returns rebounds
  {
    return rebounds;
  }
  
  protected void setAssists(int assists) //allows assists to be changed
  {
    this.assists = assists;
  }
  
  protected int getAssists() //returns assists
  {
    return assists;
  }
}