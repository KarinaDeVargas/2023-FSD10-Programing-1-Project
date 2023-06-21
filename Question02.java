package FinalProject;

import java.util.Scanner;

public class Question02 
{

	public static void main(String[] args) 
	{

		Scanner kb = new Scanner(System.in);

		System.out.println("Joker: "); //Retrieving data from user
		int joker = kb.nextInt();

		System.out.println("Number of element: "); //Retrieving data from user
		int size = kb.nextInt();

		int[] array = new int[size];

		System.out.println("Enter numbers: "); //Retrieving data from user
		for(int i = 0; i < size; i++) 
		{
			array[i] = kb.nextInt();
		}
		
		kb.close();

		//Deduct numbers
		int i;

		for(i = 0; i < size; i++)  //Accessing array elements
		{
			while(array[i] >= joker) //while element is greater or equal to joker
			{
				array[i] -= joker; //then element is subtracted by joker's value
			}
		}
		//Print the output
		for(i = 0; i < size; i++) 
		{
			System.out.print(array[i] + " ");
		}
		
	}
}
