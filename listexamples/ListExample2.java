package come.corejava.listexamples;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(45);
		for (int i = 45; i <= 55; i++) {
			list.add(i);
		}
		list.add(4, 65);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(4);
		System.out.println(list);
		System.out.println(list.size());

		// For loop

		for (int i = 0; i < list.size(); i++) {
			int ele = list.get(i);
			System.out.println(ele);
		}

		// For each loop
		System.out.println("-------------------------- for each ---------------------------");
		for (int ele : list) {
			System.out.println(ele);
		}

		// Streams
		System.out.println("---------------------------Stream-------------------------------");
		list.stream().forEach(System.out::println);
	}
}
