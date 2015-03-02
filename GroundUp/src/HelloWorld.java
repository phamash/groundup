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
	
	
}
