import java.util.*;
import java.io.*;

public class TriviaTestGiver {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String filename = input.nextLine();
		TriviaTest test = new TriviaTest(filename);
		test.giveTest();
	}

}
