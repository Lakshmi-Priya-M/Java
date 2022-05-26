package stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import stream.realTimeExample.Employee;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "first");
		map.put(2, "second");
		map.put(3, "third");
		map.put(4, "fourth");
		map.put(5, "five");
		
		List<Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
		
		// traditional way of sorting map using anonymous class
		
		/*Collections.sort(entries, new Comparator<Entry<Integer,String>>(){
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});*/
		
		// using lamda expression
		
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		// using stream
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println(entries);
		
		// if map contains employee object and that should be sorted using salary
		
		// traditional method using anonymous class
		
		Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
			
		});
		
		employeeMap.put(new Employee(101, "lakshmi", "EEE", 500000) , 60);
		employeeMap.put(new Employee(102, "priya", "IT", 400000), 70);
		employeeMap.put(new Employee(103, "shiva", "ECE", 600000), 80);
		employeeMap.put(new Employee(104, "kumar", "Mech", 700000), 40);
		
	    System.out.println(employeeMap);
		
		// tradition method using lambda expression
		
		Map<Employee, Integer> employeeMap1 = new TreeMap<>(( o1,  o2) -> o1.getSalary() - o2.getSalary());
		
		employeeMap1.put(new Employee(101, "lakshmi", "EEE", 500000) , 60);
		employeeMap1.put(new Employee(102, "priya", "IT", 400000), 70);
		employeeMap1.put(new Employee(103, "shiva", "ECE", 600000), 80);
		employeeMap1.put(new Employee(104, "kumar", "Mech", 700000), 40);
		
		System.out.println(employeeMap1);
		
		// using stream
		
		Map<Employee, Integer> mapUsingStream = new HashMap<>();
		
		mapUsingStream.put(new Employee(101, "lakshmi", "EEE", 500000) , 60);
		mapUsingStream.put(new Employee(102, "priya", "IT", 400000), 70);
		mapUsingStream.put(new Employee(103, "shiva", "ECE", 600000), 80);
		mapUsingStream.put(new Employee(104, "kumar", "Mech", 700000), 40);
		
		// in ascending
		mapUsingStream.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
		
		
		// in descending
		mapUsingStream.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);

	}

}
