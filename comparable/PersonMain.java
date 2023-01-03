package come.corejava.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonMain.sortPersonObjects();

	}

	private static void sortPersonObjects() {
		
		List<Person> person = new ArrayList<Person>();
		
		person.add(new Person(1,"Ahamad",99));
		person.add(new Person(3,"Mallesh",59));
		person.add(new Person(2,"Durga",19));
		
		System.out.println(person);
		
		Collections.sort(person);
		
		System.out.println(person);
		
		Collections.sort(person,Collections.reverseOrder());
		
		System.out.println(person);
		
		
	}

}
