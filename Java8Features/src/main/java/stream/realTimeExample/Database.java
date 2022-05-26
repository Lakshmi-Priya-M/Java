package stream.realTimeExample;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public static List<Employee>  getEmployee(){
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee(101, "lakshmi", "EEE", 500000));
		listOfEmployee.add(new Employee(102, "priya", "IT", 400000));
		listOfEmployee.add(new Employee(103, "shiva", "ECE", 600000));
		listOfEmployee.add(new Employee(104, "kumar", "Mech", 700000));
		return listOfEmployee;
		
	}
}
