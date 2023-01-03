package come.corejava.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoComparator {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orenge");

		/////// assending order

		// List<String> sortedList =
		// fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		// System.out.println(sortedList);

		// List<String> sortedList1 =
		// fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		// System.out.println(sortedList1);

		// List<String> sortedList2 =
		// fruits.stream().sorted().collect(Collectors.toList());
		// System.out.println(sortedList2);

		/// decending order

		List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList3);

		List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedList1);

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(10, "Ramesh", 30, 400000));
		emp.add(new Employee(20, "Santosh", 29, 350000));
		emp.add(new Employee(30, "sanjay", 30, 450000));
		emp.add(new Employee(40, "Pramod", 29, 500000));

		List<Employee> employee = emp.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(employee);

		List<Employee> employee1 = emp.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(employee1); // sorting in Ascending order
		
		List<Employee> employee2 = emp.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(employee2);  // Descending order

	}

}
