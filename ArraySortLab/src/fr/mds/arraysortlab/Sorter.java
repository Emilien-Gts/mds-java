package fr.mds.arraysortlab;

public class Sorter {
	int[] bubbleSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
		
		return array;
	}
	
	int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++){  
            int index = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        } 
		
		return array;
	}
	
	int[] insertionSort(int[] array) {
		int i, key, j;  
	    for (i = 1; i < array.length; i++){  
	        key = array[i];  
	        j = i - 1;  
	        
	        while (j >= 0 && array[j] > key){  
	        	array[j + 1] = array[j];  
	            j = j - 1;  
	        }  
	        array[j + 1] = key;  
	    } 
	    
	    return array;
	}
	
	void displayArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(i +": "+array[i]);
		}
	}
}
