import java.util.*;


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
	
	public static void main(String[] args){
	System.out.println("Hello world");
	}
}
