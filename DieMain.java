import java.util.Scanner;

/**
 * 
 * @author 	Leo Li
 * 
 * MULTI SIDED DIE MAIN
 *
 */
public class DieMain 
{

	public static void main(String[] args) 
	{
		/*
		 * TASK ONE
		 * 
		 * create two twelve sided dice and
		 * roll the dice until you roll doubles
		 * (print each roll to the screen).
		 * Once you have rolled doubles, print
		 * to the screen the number of times
		 * you had to roll the dice to get doubles
		 * 
		 */
		MultiSidedDie die1 = new MultiSidedDie(12);
		MultiSidedDie die2 = new MultiSidedDie(12);
		int die1Value = die1.roll();
		int die2Value = die2.roll();
		
		while(die1Value != die2Value)
		{
			System.out.println("Dice 1: " + die1Value);
			System.out.println("Dice 2: " + die2Value);
			die1Value = die1.roll();
			die2Value = die2.roll();
		}
		
		System.out.println("Dice 1: " + die1Value);
		System.out.println("Dice 2: " + die2Value);
		System.out.println("Number of times to roll doubles: " + die1.getNumRolls());
		
		
		/*
		 * TASK TWO
		 * 
		 * ask the user to enter the number of sides
		 * they would like to have on their dice and
		 * construct the appropriate Die object (only one).
		 * 
		 * ask the user to identify a target roll 
		 * value(ensure that it is between 1 and numSides).
		 * Roll the Die 20 times, printing
		 * each roll.  Print the number of times the
		 * target was rolled
		 *
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("How many sides do you want to have on your dice? ");
		int sides = in.nextInt();
		
		MultiSidedDie die3 = new MultiSidedDie(sides);
		
		System.out.println("What value do you want to roll? ");
		int targetRoll = in.nextInt();
		
		while(targetRoll < 1 || targetRoll > die3.getNumSides())
		{
			System.out.println("Not a valid input. Input a value between 1 and " + die3.getNumSides() + " ");
			targetRoll = in.nextInt();
		}
		
		int targetCount = 0;
		int die3Value = die3.roll();
		while(die3.getNumRolls() < 21)
		{
			System.out.println("Dice Value: " + die3Value); 
			if(die3Value == targetRoll)
			{
				targetCount +=1;
			}
			die3Value = die3.roll();
		}
		
		System.out.println("The target was rolled " + targetCount + " times.");

		
		
		/*
		 * TASK THREE
		 * 
		 * As in task two, ask the user to identify the number
		 * of sides for the Die object and construct the 
		 * appropriate Die.  Ask the user to identify a target
		 * roll value(ensure that it is a valid entry).  
		 * Roll the die until you the target is rolled.  Print
		 * each roll.   Print the number of rolls required to 
		 * roll the target value.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("How many sides do you want to have on your dice? ");
		int sides2 = input.nextInt();
		
		MultiSidedDie die4 = new MultiSidedDie(sides2);
		
		System.out.println("What value do you want to roll? ");
		int targetRoll2 = input.nextInt();
		
		while(targetRoll2 < 1 || targetRoll2 > die4.getNumSides())
		{
			System.out.println("Not a valid input. Input a value between 1 and " + die4.getNumSides() + " ");
			targetRoll2 = input.nextInt();
		}
		
		int die4Value = die4.roll();
		int count = 1;
		
		while(die4Value != targetRoll2)
		{
			System.out.println("Dice Value: " + die4Value);
			die4Value = die4.roll();
			count += 1;
		}
		
		System.out.println("Dice Value: " + die4Value);
		System.out.println("It took " + count + " rolls to roll the target.");
	}

}
