/**
 * 
 * @author Leo Li
 * 
 * die with differing number of sides
 *
 */

public class MultiSidedDie 
{
	
	//FIELDS
	/*
	 * fields:  integer numSides: number of sides of this die
	 * 			integer numRolls: number of times this die has rolled
	 * 
	 */
	private int numSides;
	private int numRolls;
	
	
	//CONSTRUCTORS
	/*
	 * create a constructor which takes no 
	 * arguments and sets the number of sides
	 * to 6
	 */
	public MultiSidedDie()
	{
		numSides = 6;
	}
	
	/*
	 * create a contructor which takes one integer
	 * argument and uses it to initialize the number
	 * of sides for this die object.  IF the argument
	 * is less than 4, the die will have 4 sides.
	 */
	public MultiSidedDie(int sides)
	{
		if(sides < 4)
		{
			numSides = 4;
		}
		else
		{
			numSides = sides;
		}
	}
	//METHODS
	
	
	/*
	 * create a method called roll which takes no 
	 * arguments and returns an integer from
	 * 1 to numSides
	 */
	public int roll()
	{
		numRolls += 1;
		return (int)(Math.random()*numSides + 1);
	}
	
	/*
	 * create a method called getNumSides which takes
	 * no arguments and retuns numSides
	 */
	public int getNumSides()
	{
		return numSides;
	}
	
	/*
	 * create a method called getNumRolls which takes
	 * no arguments and returns the number of
	 * times the die has been rolled
	 */
	
	public int getNumRolls()
	{
		return numRolls;
	}
	
	/*
	 * create a method called reset which takes no arguments
	 * and returns no value.  It resets the value of numRolls
	 * to zero
	 */
	public void reset()
	{
		numRolls = 0;
	}
	
	/*
	 * create a method called setNumSides which takes one
	 * integer argument and changes the value of numSides to 
	 * the value passed in the argument. If the argument is
	 * less than 4, the number of sides will be set to
	 * four.  It returns no value
	 * 
	 */
	public void setNumSides(int sideNum)
	{
		if(sideNum < 4)
		{
			numSides = 4;
		}
		else
		{
			numSides = sideNum;
		}
	}
	
	/*
	 * write an appropriate toString method for this class
	 */
	public String toString()
	{
		return "Number of Sides: " + Integer.toString(numSides) + "Number of Rolls: " + Integer.toString(numRolls);
	}

}
