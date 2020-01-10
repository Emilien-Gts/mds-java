package fr.mds.doublearraydemo;

public class Launcher {
	public static void main(String[] args) {
		//one dimension array
		String[] myArray = new String [6];
		
		//set content array
		for(int i=0; i < myArray.length; i++) {
			myArray[i] = "i" + i;
		}
		
		//print all array
		for(int i=0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		//two dimension array
		String[][] my2DimensionArray = new String[4][3];
		
		//set content 2 dimension array
		for(int i=0; i< my2DimensionArray.length; i++) {
			for(int j=0; j < my2DimensionArray[i].length; j++) {
				my2DimensionArray[i][j] = "i"+i+":j"+j;
			}
		}
		
		//print al 2 dimension array
		for(int i=0; i< my2DimensionArray.length; i++) {
			for(int j=0; j < my2DimensionArray[i].length; j++) {
				System.out.println(my2DimensionArray[i][j]);
			}
		}
		
	}
}
