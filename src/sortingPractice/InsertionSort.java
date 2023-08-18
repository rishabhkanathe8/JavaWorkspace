package sortingPractice;

public class InsertionSort {

	public static void InsertionSorting(int array[]) {
		
		for(int i=1; i < array.length; i++) {
			int temp =array[i];
			int j = i-1;
				while(j >0 && array[j] > array[j+1]) {
				array[j+1]= array[j];
				j = j-1;
			}
				array[j+1]= temp;
		}
	}
}
