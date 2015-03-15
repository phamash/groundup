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

		}				END OF QUICKSORT METHOD */
	
	
	
	}
