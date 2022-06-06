package Exam;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class gui_console {
	



	static ArrayList<Student> arrayStudent = new ArrayList<Student>();
	
	static ArrayList<Teacher> arrayTeacher = new ArrayList<Teacher>();
	
	static ArrayList<Class> arrayClass = new ArrayList<Class>();

	
	public static void main(String[] args) {
		
		String option = JOptionPane.showInputDialog(null,"Console:1,Gui:2");
		Scanner input = new Scanner(System.in);
		if(option.equals("1"))
		{
			while(true)
			{
			menu();
			System.out.println(">>");
			int selection = input.nextInt();
			switch(selection) {
			case 1:
				addStudent();
				break;
			case 2:
				listStudent();
				break;
			
			case 3:
				addTeacher();
				break;
				
			case 4:
				listTeacher();
				break;
			
			case 5:
				addClass();
				break;
				
			case 6:
				listClass();
				break;
				
			case 9:
				new GuiApplication();
				break;
			case 10:
				System.exit(0);
				break;
			}
			
			
				

			}
	
		}

		else if(option.equals("2"))
			new GuiApplication();
			

	}
	
	public static void menu() {
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Add Student:1, List Student:2, Add Teacher:3, List Teacher:4, Add Class:5, List Class: 6, Add Class-Teacher-Student:7, List Class-Teacher-Student:8, Gui Application:9, 10-Exit");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(">>");
	}
	
	public static void addStudent() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Name?");
		String name = input.nextLine();
		System.out.println("Surname?");
		String surname = input.nextLine();
		System.out.println("Age?");
		int age = input.nextInt();
		
		
		arrayStudent.add(new Student(name,surname,age));
		
		System.out.println("The student is added successfully");
		
	}
	
	public static void listStudent() {
		
		for(Student s:arrayStudent)
			System.out.println(s);
		
	}
	
	public static void addTeacher() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Name?");
		String name = input.nextLine();
		System.out.println("Surname?");
		String surname = input.nextLine();
		System.out.println("Age?");
		int age = input.nextInt();
		
		
		arrayTeacher.add(new Teacher(name,surname,age));
		
		System.out.println("The teacher is added successfully");
		
		
	}
	
	public static void listTeacher() {
		
		for(Teacher t:arrayTeacher)
			System.out.println(t);
		
	}
	
	public static void addClass() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ClassName?");
		String className = input.nextLine();
		System.out.println("Capacity?");
		int capacity = input.nextInt();
		
		
		arrayClass.add(new Class(className,capacity));
		
		System.out.println("The class is added successfully");
		
		
	}
	
	public static void listClass() {
		
		for(Class c:arrayClass)
			System.out.println(c);
		
	}
	
	

}
