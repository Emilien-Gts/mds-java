package fr.mds.exercisecollectionproject.laucher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import fr.mds.exercisecollectionproject.model.Student;

public class Laucher {

	public static void main(String[] args) {
		Student[] students = new Student[4];
		
		Student didier 		= new Student(1213141, "Didier", 'M', 17.2);
		Student claudette 	= new Student(3146625, "Claudette", 'F', 6.5);
		Student clement		= new Student(2425638, "Clément", 'M', 12.6);
		Student chloe		= new Student(6363763, "Cholé", 'F', 15.6);
		
		students[0]= didier;
		students[1]= claudette;
		students[2]= clement;
		students[3]= chloe;
		
		//Comparable
		
		int i=0;
		for(Student temp: students){
		   System.out.println("fruits " + ++i + " : " + temp.getName()+ 
			", Quantity : " + temp.getAverageGrade());
		}
		
		Arrays.sort(students);
		System.out.println("\nSort by average grade\n");

		int j=0;
		for(Student temp: students){
		   System.out.println("fruits " + ++j + " : " + temp.getName()+ 
			", Quantity : " + temp.getAverageGrade());
		}
		
		System.out.println("\n\n");
		
		//Comparator
		int k=0;
		for(Student temp: students){
		   System.out.println("fruits " + ++k + " : " + temp.getName()+ 
			", Quantity : " + temp.getAverageGrade());
		}
		
		Arrays.sort(students, Student.StudentNameComparator);
		System.out.println("\nSort by name\n");

		int l=0;
		for(Student temp: students){
		   System.out.println("fruits " + ++l + " : " + temp.getName()+ 
			", Quantity : " + temp.getAverageGrade());
		}
		
	}

}
