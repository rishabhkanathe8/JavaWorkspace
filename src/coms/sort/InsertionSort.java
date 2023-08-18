package coms.sort;

public class InsertionSort {
	
	public static void insertionSort(int array[]) {
		//7,15,6,122,1
		for(int i =1; i < array.length; i++) {
			int temp = array[i];//8
			int j = i -1;//
			while(j >= 0 && array[j] > temp) {
				array[j+1]= array[j];
				j = j-1;
			}
			array[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int array[] = {7,55,8,12,1};
		insertionSort(array); 
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
