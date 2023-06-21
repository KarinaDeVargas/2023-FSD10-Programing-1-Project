package FinalProject;

public class Question05
{

	public static void main(String[] args) 
	{ 
		int[] array = new int[] {3, 2, 3};
        //int[] array = new int[] {2, 2, 1, 1, 1, 2, 2};
      
        System.out.print("Input: nums = ");    
       
        for(int i = 0; i <array.length; i++) 
        {     
            System.out.print(array[i] + "  ");    
        }
        
       findMajorityElement(array);              
	}
	
	//creating method to find the majority element
	public static void findMajorityElement(int array[]) // using nested loops
	{
		int counter = 0;
		int majorityElem = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++) //Looking element by element
			{
				if(array[i] == array[j]) //if elements are same value then,
				{
					counter++; //counter receives one
				}
			}
			
			if(counter > (array.length / 2)) //if the counter is bigger than half of array length,
			{
				majorityElem = array[i]; //then majority element is equal to the element
				System.out.println("\nOutput: " + majorityElem);
				break; //stop looking for majority element
			}
			
			counter = 0; //counter needs to be reset before we go back to the first loop
		}
	}   
}
		
	
