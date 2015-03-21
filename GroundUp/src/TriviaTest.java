import java.util.*;
import java.io.*;			

public class TriviaTest {

	private String[] correctAnswers;		//each entry is a T or an F
	private String[] responses; 			//the Test-Taker's answers
	private int numQuestions;
	private Scanner input;
	private Scanner fileInput;
	
	public TriviaTest(){
		System.out.println("No filename supplied");
		System.exit(0);
	}
	
	public TriviaTest(String filename) throws IOException {
		input = new Scanner(System.in);
		
		//open the file with the questions and answers
		File questionFile = new File(filename);
		if(!questionFile.exists())
		{
			System.out.println("Errore: " + filename + " not found");
			System.exit(0);
		}
		fileInput = new Scanner(questionFile);		//reads from file
		
		//fire read the number of questions in the file
		numQuestions = fileInput.nextInt();
		
		//read correct answers from the input file
		correctAnswers = new String[numQuestions];
		for(int i = 0; i < numQuestions; i++)
			correctAnswers[i] = fileInput.next();
		
		responses = new String[numQuestions];
		fileInput.nextLine();				//move file pointer to the beginning of the next line
	}
	
	public void giveTest(){
		//displays each question and records the answer
		System.out.println("Answer each of the following: T or t for True and F or F for false\n");
		for(int i = 0; i <numQuestions; i++)
		{
			System.out.println((i+1) + ". " + fileInput.nextLine());
			System.out.print("Answer: ");
			responses[i] = (input.next()).toUpperCase();		//get user's response, convert it to upper case
			System.out.println();
		}
		
		System.out.println("You scored: " + scoreTest() + "% on the test");
		showCorrectAnswers();
		
		fileInput.close();
	}
	
	private int scoreTest(){
		//scores the test and returns the percent of correct answers
		int correct = 0;
		for(int i = 0; i <numQuestions; i++)
		if(responses[i].equals(correctAnswers[i]))
			correct++;
		return Math.round((100*correct)/numQuestions);
	}
	
	private void showCorrectAnswers(){
		//displays the correct answers
		System.out.println("\tCorrect Answers:\tYour Answers: ");
		for(int i = 0; i <numQuestions; i++)
			System.out.println((i+1) +".\t" + correctAnswers[i] + "\t\t\t" + responses[i]);
	}
}
