import java.*;

public class SoccerPlayer extends SportsPlayer //this is a subclass of SportsPlayer
{
  protected int points;
  protected String position;
  protected int assists;
  protected int cards;
  protected SoccerPlayer(String name, int number, String salary, String position, int assists, int cards) 
  {
    super(name, number, salary);
    this.name = name;
    this.number = number;
    this.salary = salary;
    this.position = position;
    this.assists = assists;
    this.cards = cards;
  }
  
  protected void setPosition(String position) //allows position to be changed
  {
    this.position = position;
  }
  
  protected String getPosition() //returns position
  {
    return position;
  }

  protected void setAssists(int assists) //allows assists to be changed
  {
    this.assists = assists;
  }
  
  protected int getAssists() //returns assists
  {
    return assists;
  }
  
  protected void setCards(int cards) //allows cards to be changed
  {
    this.cards = cards;
  }
  
  protected int getCards() //returns cards
  {
    return cards;
  }
}