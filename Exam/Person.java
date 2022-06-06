package Exam;

public class Person {

	
	private String name,surname;
	private int age;
	
	public Person(String name,String surname,int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		
	}
	
	public Person() {
		this("","",0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%d\n", name,surname,age);
		
	}
	public static void main(String[] args) {
		new Person();
		new Person("arda","arslant�rk",5);
		
	}

}
