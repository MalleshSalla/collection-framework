package come.corejava.listexamples;

import java.util.ArrayList;
import java.util.List;

public class UsingEmployeeConstructor 
{
	public static void main(String[] args)
	{
		List<Employees> emp=new ArrayList<>();
		emp.add(new Employees(1,"sai",15000));
		emp.add(new Employees(2,"ram",16000));
		emp.add(new Employees(3,"jai",12000));
		for(Employees data:emp)
		{
			if((data.geteName().equals("sai")||data.geteName().equals("ram"))&&data.getSalary()>=15000)
			{
			   System.out.println(data);
			}
		}
		
	}
}
class Employees
{
	int eId;
	String eName;
	int salary;
	
	Employees(int eId,String eName,int salary)
	{
		this.eId=eId;
		this.eName=eName;
		this.salary=salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return eId+" "+" "+eName+" "+salary;
	}
}