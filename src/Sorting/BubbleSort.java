package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int size = unsortedArray.length;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i =1; i< size; i++) {
				if (unsortedArray[i-1] > unsortedArray[i]) {
					swap(unsortedArray, i-1, i);
					swapped = true;
				}
			}
			size = size -1;
		}
		return unsortedArray;
	}

	private static void swap(int array[], int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
