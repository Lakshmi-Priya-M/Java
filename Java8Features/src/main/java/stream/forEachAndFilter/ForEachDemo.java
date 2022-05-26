package stream.forEachAndFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Hi");
		arrayList.add("Hello");
		arrayList.add("Vanakam");
		arrayList.add("Namaste");
		arrayList.add("Hey");
		
		// forEach internally uses consumer functional interface which has accept method
		
		arrayList.stream().forEach(t-> System.out.println(t));
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Hi");
		map.put(2, "Hello");
		map.put(3, "Vanakam");
		map.put(4, "Namaste");
		map.put(5, "Hey");
		
		// one way of iterating map
		map.forEach((key,value) -> System.out.println("key = " + key + " value = " + value));
		
		// another way of iterating map using entry set
		
		map.entrySet().stream().forEach(obj-> System.out.println(obj));
		
		// In the below code, whatever the argument passed in accept method, is manipulated and the outcome is printed.
		Consumer<String> consumer = t -> System.out.println(t);
		consumer.accept("Hi lakshmi");
		
		// forEach method simply iterates the list and it calls the accept method of the consumer interface
		for(String str : arrayList) {
			consumer.accept(str);
		}

	}

}
