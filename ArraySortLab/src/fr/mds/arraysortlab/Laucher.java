package fr.mds.arraysortlab;


public class Laucher {
	
	public static void main(String[] args) {
		Sorter s = new Sorter();
		
		int[] array = new int[10];
		
		for(int i=0; i<10; i++) {
			array[i] = 0 + (int)(Math.random() * ((100 - 0) + 1));
		}
		
		System.out.println("Basic array");
		s.displayArray(array);
		s.bubbleSort(array);
		//s.insertionSort(array);
		//s.selectionSort(array);
		
		System.out.println("\n");
		System.out.println("After sort");
		s.displayArray(array);
	}
}
