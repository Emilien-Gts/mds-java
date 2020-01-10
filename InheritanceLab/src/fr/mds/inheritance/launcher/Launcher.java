package fr.mds.inheritance.launcher;

import fr.mds.inheritance.model.CollegeStudent;
import fr.mds.inheritance.model.Person;
import fr.mds.inheritance.model.Student;
import fr.mds.inheritance.model.Teacher;

public class Launcher {
	public static void main(String[] args) {
		Person person = new Person("Didider", 24, "m");
		Student student = new Student("Claude", 32, "m", "3213D", 17.2);
		Teacher teacher = new Teacher("Virginie", 47, "f", "Chemistry", 1400.08);
		CollegeStudent collegeStudent = new CollegeStudent("Jean-Philippe", 134, "m", "4132F", 19.4, "major", 22);
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(teacher.toString());
		System.out.println(collegeStudent.toString());
	}
}
