package come.corejava.listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UsingEmployeeSetterGetter 
{
	public static void main(String[] args)
	{
		
		Employe emp1=new Employe();
		Employe emp2=new Employe();
		Employe emp3=new Employe();
			
		emp1.setempId(101);
		emp2.setempName("Ram");
		emp2.setsalary(15000);
		
		emp2.setempId(102);
		emp1.setempName("Raj");
		emp1.setsalary(12000);
		
		
		
		emp3.setempId(103);
		emp3.setempName("Jai");
		emp3.setsalary(14000);
		
		List<Employe> e=new ArrayList<Employe>();
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		

		
	    for(Employe data:e)   //When we try to print object it will 
		{
			System.out.println(data.display());  
		}
	
			
	}
}
class Employe
{
	int empId;
	String empName;
	int salary;
	
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public int getempId()
	{
		return empId;
	}
	public void setempName(String empName)
	{
		this.empName=empName;
	}
	public String getempName()
	{
		return empName;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getsalary()
	{
		return salary;
	}
	public String toString() //toString method is overridden.
	{
		return empId+" "+empName+" "+" "+salary;
	}
	public String display() //toString method is overridden.
	{
		return empId+" "+empName+" "+" "+salary;
	}
	
}
