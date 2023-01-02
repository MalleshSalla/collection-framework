package come.corejava.listexamples;

import java.util.ArrayList;

public class ListExamples1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(3);//ArrayList can hold any type of data
		al.add(new Student(101,"student1"));
		al.add(new Employee(102,"employee1"));
		al.add(new Customer(103,"customer1"));
		
		System.out.println(al);
	}
}


class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}


class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}



class Customer{
	int id;
	String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
}

