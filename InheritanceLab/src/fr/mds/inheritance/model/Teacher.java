package fr.mds.inheritance.model;

public class Teacher extends Person{
	String subject;
	double salary;

	public Teacher(String name, int age, String gender, String subject, double salary) {
		// TODO Auto-generated constructor stub
		super(name, age, gender);
		this.subject = subject;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", salary=" + salary + "]";
	}
	
}
