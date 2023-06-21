package FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Question03 
{

	public static void main(String[] args) 
	{
		
		int i, j, rowsize, columnsize, num1;
		int counter ;
		Random random_num = new Random();
		Scanner kb = new Scanner(System.in);
		
		//Retrieving data from user
		System.out.println("Please enter the size of the row and the size of the column: ");
		rowsize = kb.nextInt();
		columnsize = kb.nextInt();

		int[][] original_array = new int[rowsize][columnsize];

		for (i = 0; i < original_array.length; i++) 
		{
			for (j = 0; j < original_array[i].length; j++) 
			{
				original_array[i][j] = random_num.nextInt(100) + 1; //creating original array with random numbers from 1 to 100
			}
		}
		
		System.out.println("============================================ ");
		System.out.println("Original array: ");
		System.out.println("============================================ ");
		
		for(i = 0 ; i < original_array.length; i++) //Printing original array
		{
			for(j = 0; j < original_array[i].length; j++) 
			{
				System.out.printf("\t" + original_array[i][j] );
			}
			System.out.println();
		}
		
		System.out.println("============================================ ");		
		System.out.println("Please enter the number you would like to replace: ");
		num1 = kb.nextInt();
		
		counter  = arrayReplaceNumForZero(original_array, num1);
		
		if(counter > 0 ) {
			System.out.println("\n===================================================== ");
			System.out.println("Number " + num1 + " has been replaced. Pease see new array: ");			
			System.out.println("===================================================== ");
			for(i = 0 ; i< original_array.length;i++) //Printing new array
			{
				for(j = 0; j < original_array[i].length;j++) 
				{
					System.out.printf("\t" + original_array[i][j] );
				}
				System.out.println();
			}			
		}
		else 
		{
			System.out.println("Error. Entered number not found in the array.");
		}
		
		kb.close();
	}
	
	//creating method to find the value and replace it for 0
	public static int arrayReplaceNumForZero(int[][] array, int val1)
	{
		int counter = 0; //
		for(int i = 0 ; i < array.length; i++) 
		{
			for(int j = 0 ; j < array[i].length; j++) //Looking one by one to find element equals given value
			{
				if(array[i][j] == val1) //If value is found in the array,
				{
					array[i][j] = 0; //then replace it for 0
					
					System.out.println("Entered number found in the index: [" + i + "] and [" + j + "]");
					counter++;
				}
			}
		}
		return counter;
	}
}		
		
