package come.corejava.listexamples;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
  public static void main(String[] args) {
   
    List<String> list = new ArrayList<>();
  
    list.add("apple");
    list.add("banana");
    list.add("cherry");

    list.add(1, "mango");
    
    System.out.println(list);

    for (String fruit : list) {
      System.out.println(fruit);
    }
    
    list.remove(2);
    
    System.out.println(list);
    
    String fruit = list.get(1);
    System.out.println(fruit);
    
    boolean hasCherry = list.contains("cherry");
    System.out.println(hasCherry);
    
    int size = list.size();
    System.out.println(size);
    
    boolean isEmpty = list.isEmpty();
    System.out.println(isEmpty);
    
  }
}
