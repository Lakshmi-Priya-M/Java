package stream.forEachAndFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Shiva");
		list.add("Lingesh");
		list.add("Bhavani");
		list.add("Lakshmi");
		list.add("Priya");
		
		
		// traditional approach
		for(String s : list) {
			if(s.startsWith("L")) {
				System.out.println(s);
			}
		}
		
		// using stream and filter method
		// filter method internally uses predicate interface
		// In predicate, test method returns the boolean
		list.stream().filter(t-> t.startsWith("L")).forEach(t->System.out.println(t));
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Hi");
		map.put(2, "Hello");
		map.put(3, "Vanakam");
		map.put(4, "Namaste");
		map.put(5, "Hey");
		
		// prints the even entryset
		map.entrySet().stream().filter(k-> k.getKey() % 2 == 0).forEach(t->System.out.println(t));
		
		

	}

}
