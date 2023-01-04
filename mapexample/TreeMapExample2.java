package com.corejava.mapexample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, Employee> map=new TreeMap<>();
		Employee emp1=new Employee(101, "kumar", 20000);
		Employee emp2=new Employee(102, "ram", 22000);
		Employee emp3=new Employee(103, "hari", 25000);
		map.put(1, emp1);
		map.put(3, emp3);
		map.put(2, emp2);
		
		for(Map.Entry<Integer, Employee> data:map.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue().geteId()+" "+data.getValue().geteName()+" "+data.getValue().getSal());
		}
	}
}
class Employee
{
	private int eId;
	private String eName;
	private int sal;
	public Employee(int eId, String eName, int sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
