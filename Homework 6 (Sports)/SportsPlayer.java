import java.*;

public class SportsPlayer //this is the parent class
{
  protected String name;
  protected int number;
  protected String salary;
  protected SportsPlayer(String name, int number, String salary)
  {
    this.name = name;
    this.number = number;
    this.salary = salary;
  }
  
  protected void setName(String name) //allows name to be changed
  {
    this.name = name;
  }
  
  protected String getName() //returns name
  {
    return name;
  }
  
  protected void setNumber(int number) //allows number to be changed
  {
    this.number = number;
  }
  
  protected int getNumber() //returns number
  {
    return number;
  }
  
  protected void setSalary(String salary) //allows salary to be changed
  {
    this.salary = salary;
  }
  
  protected String getSalary() //returns salary
  {
    return salary;
  }
}