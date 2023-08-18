package coms.sort;

public class BubbleSort {

	public static void bubbleSort(int array[]) {

		boolean isSwapped = false;
		for (int i = 0; i <= array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				return;
			}

		}
	}
	
	public static void main(String[] args) {
		int array[] = {12,12,1,12,33,4,22,-56,7,88};
		bubbleSort(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
