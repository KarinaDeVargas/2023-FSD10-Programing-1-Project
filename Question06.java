package FinalProject;

public class Question06 
{ 

	public static void main(String[] args) 
	{
		//int [] array = new int[] {3, 0, 1,};
		int [] array = new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1};
        
        System.out.print("Array: ");    
        for (int i = 0; i <array.length; i++) 
        {     
            System.out.print(array[i] + "  ");    
        }    
        System.out.println();        
       
        System.out.println("Missing number is:  " + findMissingNo(array));         
	}
	
	// Method to find the missing number
	public static int findMissingNo(int[] array) 
	{
		int sumOfElements = 0;
		int length = array.length;
		
		for(int i : array)  //
		{
			sumOfElements += i;
		}
		
		int n = ((length * (length + 1)) / 2);
		int missingNum = n - sumOfElements;
		
		return missingNum;		
	}	  		
}




