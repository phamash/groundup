import java.util.*;
public class Dice {

	private int numDice;
	private Random random;
	
	public Dice(){
		numDice = 1;
		random = new Random();
	}
	
	public Dice(int n){
		numDice = n;
		random = new Random();
	}
	
	public int rollDice(){
		//returns the number of spots shownn when tossing numDice dice
		int sum = 0;
		
		for (int i = 1; i <=numDice; i++)			//for each dice in the set
			sum += random.nextInt(6)+1;		//add an integer between 1 and 6 to sum
		return sum;
	}
	
	public int getNumDice(){
		return numDice;
	}
	
	public void setNumDice(int n){
		numDice = n;
	}
}

