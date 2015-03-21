import java.util.*;
import java.io.*;

public class HelloWorld {
	/*calculates Grade Averages of students
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numStudents, numGrades;
		int grade; 	//the individual grade
		int sum = 0; 	//the sum of a student's grades 
		double average;
		
		//prompt for number of students and then grades per student
		System.out.print("Number of students: ");
		numStudents = input.nextInt();
		System.out.print("Number of Grades: ");
		numGrades = input.nextInt();
		System.out.println();
		
		for(int i = 1; i <=numStudents; i++) 	//for each student
		{
			sum = 0;
			System.out.println("Grades for student: " + i );
			for(int j = 1; j <= numGrades; j++)
			{
					System.out.println(" " + j + ":");
					grade = input.nextInt();
					sum+= grade;
		}
			average = (double)sum/numGrades;
			System.out.print("Average: " + average);
			System.out.println();
			}
		}
	}
 finished with the method for calculating student's average grades	*/

	/* method for calculating the calories burned for each mile run
	public static double caloriesBurned(double weight, double distance){
		
		//returns the number of calories burned using the formula
		//calories = .653 x weight x distance
		double calories = .653*weight*distance;
		return calories;
	}
	public static void main(String[] args){
		Scanner input;
		double myWeight, myDistance, totalCalories;
		
		input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		myWeight = input.nextDouble();
		System.out.print("Enter distance in miles: ");
		myDistance = input.nextDouble();
		
		totalCalories = caloriesBurned(myWeight, myDistance);
		System.out.println("Calories burned: " + totalCalories);
	}				finished with the runner's calc method	*/
	
	/*	method for inputting numbers of an array, and printing them in reverse
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	int[] list = new int[5];
	System.out.print("Enter 5 integers: ");
	
	//reads values into the liist
	for(int i = 0; i < 5; i++)
		list[i] = input.nextInt();
	
	System.out.print("List in reverse: ");
	//prints the values in reverse
	for(int i = 4; i >=0; i--)
		System.out.print(list[i] + " ");
	
	System.out.println();
	}		finished with printing the array in reverse	*/
	
	/* a method to learn about recursion
	public static void forgetMeNot(int n)	//learning about recursion. n being the number 
	// of times the message is printed
	{
		if(n!=0)
		{
			System.out.println("I miss you");
			forgetMeNot(n-1);	//the recurseive call
		}
	}
	public static void main(String[] args)
	{
		forgetMeNot(3);	//invokes the method for the first time
		System.out.println();
		System.out.println("Love, ME");
	}		finished the method about learning recursion */
	
	/*	another method to learn about recursion - non tail recursive
	public static int findLowest(int arr[], int size)
	{
		//finds the lowest integer in arr[] from index, start to end
		
		if(size==1)	
			return arr[0];	//written in case the user inputs just 1 number
		int temp = findLowest(arr, size-1);
		if(temp<arr[size-1])
		return(temp);
		else return arr[size-1];
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many students? ");
		int size = input.nextInt();
		int a[] = new int[size];
		
		for(int i = 0;i < size; i++)
		{
			System.out.println("input lottery number: ");
			a[i] = input.nextInt();
			
		}
		System.out.println("the lowest lottery number is: " + findLowest(a, size));
	}		finished with the example for non-tail recursive */
	
	/* learning more about recursion
	public static void main(String[] args){
		System.out.println(fact(5));
	}
	
	public static long fact(long n){
		if(n <= 1)
			return 1;
		else
			return n * fact(n-1);
	}	done with the example of recursion - calling itself until it reaches 1, then is done.*/
	
	/*	an enhanced for loop
	public static void main(String[] args){
		int ashley[] = {3,4,5,6,7};
		int total = 0;
		
		for(int x: ashley){	//the type, the identifier x which holds the variable to loop through
			total +=x;		//added up the numbers in the array 
		}
		System.out.println(total);	//printed the total
			
	}		finished with the enhanced for loop */

	/* learning about arrays in methods, and also an enhanced for loop
	public static void main(String[] args){
		int ashley[] = {3,4,5,6,7};
		change(ashley);
		
		for(int y: ashley)		// an enhanced for loop that will pass the array  through 
			System.out.println(y);		//prints it out on the screen
	}
	public static void change(int x[]){
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;		//takes each of the values and adds 5 to it
	} 		an array in the method	*/
	
	
	/*		ASSIGNMENT #1, CHANGE IT
	public static void main(String[] args){
	Testing testingObject = new Testing();
	System.out.println(testingObject.toMilitary());
	
	testingObject.setTime(13, 27, 9);
	System.out.println(testingObject.toMilitary());
	System.out.println(testingObject.toString());
	

	}		end of assignment #1	*/
	
	
	/*		A QUICK SORT METHOD, sorts through an array. takes the last number of the array, positions it correctly
	 * once the 'pivot' is in place, it does 2 sorts - all  those to the left, and all those to the right. Sorted!
	public static int partition(int[] a, int low, int high){	//places the pivot (a[high]) in its final position
		//returns the final position of pivot
		int left = low-1; int temp;
		int pivot = a[high];
		
		for(int right = low; right<high; right++)
		{
			if(a[right]<=pivot)
			{
				left++;
				temp = a[left];		//swap a[left] and a[right]
				a[left] = a[right];
				a[right] = temp;
			}
		}
		temp = a[left+1];		//swap pivot = a[high] with a[left+1]
		a[left+1] = a[high];
		a[high] = temp;
		return left + 1;		//pivot's new position in the array
	}
	
	public static void quickSort(int[] a, int low, int high){
		if(low<high)										//if the array has more than one item
		{
			int pivotPlace = partition(a, low, high);		//place pivot into its final position
			quickSort(a,low,pivotPlace-1);					//sort the values left of the pivot
			quickSort(a,pivotPlace+1, high);				//sort the values right of the pivot
		}
	}
	
		public static void main(String[] args){
			int[] a = {9,5,7,2,0,3,8,4,1,6};	//some sample data
			HelloWorld.quickSort(a,0,9);
			System.out.print("the sorted data: ");
			for(int i = 0; i<10;i++)
				System.out.print(a[i] + " ");

		}				END OF QUICKSORT METHOD.. */
	
	/*		LEARNING A SWITCH STATEMENT
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double balance = 5423, deposit, withdrawal;
		int transaction, newTransaction;
		
		do{
		System.out.println("Welcome! Enter your number for your transaction - ");
		System.out.println("To withdraw cash, type in 1");
		System.out.println("To make a deposit, type in 2");
		System.out.println("To check your balance, type in 3");
		
		System.out.print("Transaction number: ");
		transaction = input.nextInt();
		
		switch(transaction)
		{
		case 1: System.out.println("Enter withdrawal amount: ");
		withdrawal = input.nextDouble();
		if(withdrawal > balance)
			System.out.println("Insufficient funds");
		else
		{
			balance -= withdrawal;
			System.out.println("Your balance is $" + balance);
		}
		break;
		case 2: System.out.println("Enter deposit amount: ");
			deposit = input.nextDouble();
			balance += deposit;
			System.out.println("Your balance is $" + balance);
		break;
		case 3: System.out.println("Your balance is $" + balance);
		break;
		default: System.out.println("Invalid transaction.");
		}
		
		do{
			System.out.println("Would you like to make another transaction? 1 for Yes, 0 for no: ");
			newTransaction = input.nextInt();
			System.out.println();
				}while(newTransaction !=1);
			}while(newTransaction == 1);
		}
			END OF A SWITCH STATEMENT PROBLEM */
	
	/*	GUESSING GAME USING SOME LOOPS
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int answer;		//used to play again if the user wants to
	
		do{
			System.out.println("You will guess a number between 1 and n");
			System.out.println("Give me the value for n");
			int n = input.nextInt();
			System.out.println("OK, I'm thinking of a number between 1 and " + n);
			int number = (int)(n*Math.random())+1;
			int guess;
			int numGuesses = 0;
		
				do{		//play the game
					System.out.print("Your guess: ");
					guess = input.nextInt();
					numGuesses++;
					if(guess> number)
						System.out.println("too high!");
					else if(guess<number)
						System.out.println("too low!");
					else
						System.out.println("You've guessed it!");
				}while(number != guess);
				System.out.println("Score: " + numGuesses + " guesses");
		
					do{			//repeat so the user either quits or keeps playing
						System.out.print("Play again? 1 for YES; 0 for NO");
						answer = input.nextInt();
						System.out.println();
					}while(answer !=0 && answer != 1);
		
		}while(answer==1);
	}		END OF GUESSING GAME USING SOME LOOPS */
	
	/* learning to print a string in reverse
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int answer;
		do{	
			
		System.out.print("Print a word: ");
		String word = input.next(); 		//returns a String reference
		
		System.out.print(word + " in reverse is: ");
		for(int i = word.length()-1; i >= 0; i-- )
			System.out.print(word.charAt(i));
		System.out.println();
		//repeat so the user either quits or keeps playing
			System.out.print("Do again? 1 for YES; 0 for NO");
			answer = input.nextInt();
			System.out.println();
		}while(answer !=0 || answer == 1);
	}		END OF displaying a string in reverse */
	
	/*	CESAR'S CYPPER - shifting a message by the same nominal amount for each letter to create an encrypted message
	public static String encrypt(String msg, int shift){
		String encryptedMessage = new String();
		msg = msg.toUpperCase();
		
		for(int i = 0; i <msg.length(); i++){
			char ch = msg.charAt(i);
			if(ch >='A' && ch <='Z')
			{
				int oldPositionInAlphabet = ch - 'A';
				int newPositionInAlphabet = (oldPositionInAlphabet + shift)%26;
				encryptedMessage = encryptedMessage + (char)(newPositionInAlphabet + 'A');
			}
		}
		return encryptedMessage;
	}
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a message on one line: ");
	String message = input.nextLine();
	System.out.print("enter an integer in the rang 0-25: ");
	int shift = input.nextInt();
	System.out.println("the secret message is " + encrypt(message, shift));
}		END OF THE ENCRYPTED MESSAGE LESSON (CESAR'S CYPHER) */
	
	/* a simple program to pull a txt file and print it to the screen
	public static void main(String[] args) throws IOException {
		File inputFile = new File("quotations.txt");
		if(!inputFile.exists())
		{
			System.out.println("the file quotations.txt was not found ");
			System.exit(0);
		}
		Scanner input = new Scanner(inputFile);
		String line;
		
		while(input.hasNext())
		{
			line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}		end of a simple program to pull a txt file and print it to the screen */
	
	/* a codeWORD shift program. goes through a specified text file,  you input the codeword to shift, creates a new text file with the codeshifted message 
	public static String encrypt(String msg, String cw){
		String encryptedMessage = new String();
		msg = msg.toUpperCase();
		cw = cw.toUpperCase();
		
		for(int i = 0; i < msg.length(); i++){
			char ch = msg.charAt(i);
			int shift = (cw.charAt(i%cw.length())- 'A');
			int oldPositionInAlphabet = ch - 'A';
			int newPositionInAlphabet = (oldPositionInAlphabet + shift) % 26;
			encryptedMessage = encryptedMessage + (char)(newPositionInAlphabet + 'A');
		}
		return encryptedMessage;
	}
	public static void main(String[] args) throws IOException{
		//instantiate a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("unencrypted file: ");
		String unencryptedFile = keyboard.next();
		
		File inputFile = new File(unencryptedFile);
		Scanner input = new Scanner(inputFile);
		if(!inputFile.exists())
		{
			System.out.println("the file " + unencryptedFile + " was not found ");
			System.exit(0);
		}
		
		//open a new file for output
		System.out.print("encrypted file: ");
		String encryptedFile = keyboard.next();
		File outputFile = new File(encryptedFile);
		PrintWriter output = new PrintWriter(outputFile);
		
		if(!outputFile.exists())
		{
			System.out.println("the file " + unencryptedFile + " cannot open ");
			System.exit(0);
		}
		
		System.out.print("codeword: ");
		String codeword = keyboard.next();
		while(input.hasNext())
		{
			String line = input.nextLine();
			String encryptedLine = encrypt(line, codeword);
			output.println(encryptedLine);
		}
		input.close();
		output.close();
	}			end of a codeWORD shift program. goes through a specified text file, creates a new text file with the codeshifted message */

	
	/* 			START OF THE CHO HAN GAME USING THE DICE CLASS AND THE PLAY CHOHAN CLASS
	//using dice class, created Dice.java ; created PlayChoHan.java
	//this program has the user make a wager, guess if  the sum of 2 dice when rolled are even or odd, and if 
	//the user is correct, they win the wager. if they guess wrong, they lose. can keep playing until they don't want to
	//uses Dice.java & PlayChoHan.java
	private int winnings;		//total won or lost (negative)
	
	public HelloWorld(){
		winnings = 0;
	}
	
	//an auxiliary method, used only in the class
	private boolean win(String choice, int sum){
		if(sum%2==0 && (choice.equals("e") || choice.equals("E")))	//if the user places an Even bet
				return true;
		if(sum%2!=0 && (!(choice.equals("e") || choice.equals("E"))))	//if user places an odd bet
			return true;
		return false;
	}
	
	public void play(){
		Scanner input = new Scanner(System.in);
		Dice dice = new Dice(2);		//dice object instantiated; constructor called
		String choice;					//even or odd
		String answer;					//play again or not
		int wager;						//bet how much?
		
		do
		{
			System.out.print("enter your wager: ");
			wager = input.nextInt();
			System.out.print("Enter 'E' for even, and anything else for odd: ");
			choice = input.next();
			int sum = dice.rollDice();			//invoke the method of the dice class
			System.out.println("You rolled a " + sum);
			if(win(choice,sum))
			{
				winnings += wager;
				System.out.println("you won! Winnings so far: " + winnings);
			}
			else
			{
				winnings -= wager;
				System.out.println("you lost! Winnings so far: " + winnings);
			}
			System.out.print("Play again? Enter 'y', 'Y', or 'Yes': ");
			answer = input.next();
			System.out.println();
		}while(answer.equals("Y") || answer.equals("Yes") || answer.equals("yes") || answer.equalsIgnoreCase("y"));
		reportWinnings();
	}
	
	private void reportWinnings(){
		if(winnings>0)
			System.out.println("You won $" + winnings);
		else if(winnings<0)
			System.out.println("You lost $" + Math.abs(winnings));
		else
			System.out.println("You broke even");
		System.out.println("Thanks for playin'");
	}
	
	//using dice class, created Dice.java ; created PlayChoHan.java
	//this program has the user make a wager, guess if  the sum of 2 dice when rolled are even or odd, and if 
	//the user is correct, they win the wager. if they guess wrong, they lose. can keep playing until they don't want to
	//uses Dice.java & PlayChoHan.java
										END OF THE CHOHAN GAME */
	
	
}
