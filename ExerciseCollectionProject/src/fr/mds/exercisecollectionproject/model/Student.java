package fr.mds.exercisecollectionproject.model;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	 long id;
	 String name;
	 char gender;
	 double averageGrade;
	 
	 public Student() {
		// TODO Auto-generated constructor stub
	}
	 
	 public Student(long id, String name, char gender, double averageGrade) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.averageGrade = averageGrade;
	 }

	public double getAverageGrade() {
		return averageGrade;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student s1) {
		double  compareAverage = s1.getAverageGrade();
		
		return (int) (this.getAverageGrade() - compareAverage);
	}
	
	public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String s1Name = s1.getName().toUpperCase();
			String s2Name = s2.getName().toUpperCase();
			
			return s1Name.compareTo(s2Name);
		}
	};
	
}
