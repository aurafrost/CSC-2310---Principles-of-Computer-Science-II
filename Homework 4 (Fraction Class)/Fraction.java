import java.lang.*;

public class Fraction {

    private int num;
    private int den;
    private double dec;
 
    public Fraction(int num, int den) { //constructs fraction
      if(den == 0) { //Checks if the denominator is zero and stops the program if it is.
            System.out.println("Denominator cannot be 0");
            System.exit(0);
      }
      this.num = num;
      this.den = den;
    }

    public double getDecimal() { //returns decimal form of the fraction
      dec = num/den;
      return dec;
    }
    
    public int getNum(){ //gets the numerator
      return num;
    }

    public int getDen() { //gets the denominator
      return den;
    }

    @Override
    public String toString() { //allows fraction to be returned as a string
      return num + "/" + den;
    }

    public Fraction addFrac(Fraction f) { //adds fractions
      
      if(f.getDen() == 0) {
            System.out.println("Denominator cannot be 0");
            System.exit(0);
      }
      int newNum = num * f.getDen() + den * f.getNum();
      int newDen = den * f.getDen();
      Fraction newFrac = new Fraction(newNum, newDen);
      newFrac.Simplify(); 
      return newFrac;
    }
        
    public Fraction subtractFrac(Fraction f) { //subtracts fractions
      int newNum = den * f.getNum() - num * f.getDen();
      int newDen = den * f.getDen();
      Fraction newFrac = new Fraction(newNum, newDen);
      newFrac.Simplify();
      return newFrac;
    }
        
    public Fraction multiplyFrac(Fraction f) { //multiplies fractions
      int newNum = num * f.getNum();
      int newDen = den * f.getDen();
      Fraction newFrac = new Fraction(newNum, newDen);
      newFrac.Simplify();
      return newFrac;
    }
    
    public Fraction divideFrac(Fraction f) { //divides fractions
      int newNum = num * f.getDen();
      int newDen = den * f.getNum();
      Fraction newFrac = new Fraction(newNum, newDen);
      newFrac.Simplify();
      return newFrac;
    }

    public void Simplify() { //returns the simplist form of a fraction
      int i = 2; //i is used to divide the fraction factors
      if(num % den == 0) { //checks if the numerator can be divided by the denominator leaving a whole number
        num /= den;
        den = 1;
      } 
      else 
        if(den % num == 0) { //checks the vice versa of above
          den /= num;
          num = 1;
        } 
        else {
          while(i < Math.min(num, den)) { //stops the loop if i exceeds the numerator or denominator
            if(num % i == 0 && den % i == 0) { //checks if both num and den can be divided by i without a remainder
              num /= i;
              den /= i; 
            } 
            else {
              i++;
            }
            }
        }
    }
}