package sortingPractice;

public class BubbleSort {

	public static void BubbleSorting(int array[]) {
		boolean isSwapped = false;
		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}

		}
	}

	public static void main(String[] args) {
		int array[] = { 3, 22, 1, 33, 22, 444, 32 };
		BubbleSorting(array);
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("] \n");
	}
}
