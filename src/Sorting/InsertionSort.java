package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] array) {
		
	int j;                     
	     int key;                
	     int i;  
	     for (j = 1; j < array.length; j++)   
	    {
	           key = array[ j ];
	           for(i = j - 1; (i >= 0) && (array[ i ] < key); i--)   
	          {
	        	   array[ i+1 ] = array[ i ];
	          }
	           array[ i+1 ] = key;    
	     }
	     for(int f = 0; f < array.length / 2; f++)
	     {
	         int temp = array[f];
	         array[f] = array[array.length - f - 1];
	         array[array.length - f - 1] = temp;
	     }
    return (array);
	}
}
