package com.ksriet.ece;

public class ShowStudent {
	public void printStudent(Student student)
	{
		System.out.println("Print Student"+student);
	}
	public static void main(String [] args)
	{
		Student student=new Student();
		student.setFirstName("Priyadharshini");
		student.setDepartment("ece");
		student.setGender("female");
		
		
		
		
		ShowStudent showStudent =new ShowStudent();
		showStudent.printStudent(student);
		
	}

}
