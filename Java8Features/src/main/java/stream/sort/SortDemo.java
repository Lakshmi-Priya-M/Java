package stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import stream.realTimeExample.Database;
import stream.realTimeExample.Employee;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(10);
		list.add(42);
		list.add(14);
		list.add(24);
		list.add(74);
		
		Collections.sort(list);// ascending order
		
		System.out.println("ascending order" + list);
		
		Collections.reverse(list);// descending order
		
		System.out.println("descending order" + list);
		
		// sorting using stream
		
		list.stream().sorted().forEach(t-> System.out.print(t + " ")); // ascending order
		
		System.out.println();
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print (t + " ")); // descending order
		
		List<Employee> listOfEmployee = Database.getEmployee();
		
		// traditional method of sorting an employee using salary field
		/*Collections.sort(listOfEmployee, new MyComparator());*/
		
		// anonymous class to sort an employee using salary field
		
		/* Collections.sort(listOfEmployee, new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
			
		}); */
		
		
		// using lamda expression
		
		 Collections.sort(listOfEmployee, (o1, o2) -> o1.getSalary() - o2.getSalary());
		
		// using stream
		
		listOfEmployee.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).forEach(System.out::println);
		
		// System.out.println(listOfEmployee);
		
		// using comparing method in comparator 
		
		listOfEmployee.stream().sorted(Comparator.comparing(emp-> emp.getSalary())).forEach(System.out::println);
		
		// Employee :: getName - method reference
		
		listOfEmployee.stream().sorted(Comparator.comparing(Employee :: getName)).forEach(System.out::println);

	}
}
class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary() - o2.getSalary();
	}
	
}
