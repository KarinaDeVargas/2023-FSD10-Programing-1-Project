package FinalProject;

public class Question04 
{

	public static void main(String[] args) 
	{
   
        int[] array_original = new int[] {5, 1, 5, 0, 1, 4, 1, 3};
		
        System.out.print("Original array: ");    
        for(int i = 0; i <array_original.length; i++) 
        {     
            System.out.print(array_original[i] + " ");    
        }    
        System.out.println("\n\n==============================================");        
       
        //calling the method
        sort_Array(array_original);
	}
	
	//creating method to sort array without using library
	public static void sort_Array(int[] array_original)
	{ 
		//Sort the array in ascending order using two for loops   
		int temp = 0; //temporary variable for swapping elements
		
		//loop to traverse the array from the starting  
        for(int i = 0; i < array_original.length; i++) //getting the element from array
        {          
        	for(int j = i + 1; j < array_original.length; j++) //getting the next element i+1 
        	{                 
        		if(array_original[i] > array_original[j]) //if the first element is greater than the second element,
        		{      
        		//then swap elements if not in order
                temp = array_original[i]; //temp becomes first element    
                array_original[i] = array_original[j]; //first element becomes the second     
                array_original[j] = temp; //then the second element receives first element's value, then flow goes back to if   
        		}     
            }     
        }    
        //print sorted array
        System.out.print("\nArray sorted in ascending order: ");    
        
        for(int i = 0; i <array_original.length; i++) 
        {     
            System.out.print(array_original[i] + " ");    
        }    
    }    
}		
	
