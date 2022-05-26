package mapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers = Database.getAllCustomer();
		
		// List<Customers> to List<String> -> Data Transformation
		// mapping : customer -> customer.getEmail()
		// customer -> customer.getEmail() one to one mapping
		// when we have one to one mapping, then we can go for map
		List<String> email = customers.stream().map(customer-> customer.getEmail()).collect(Collectors.toList());
		System.out.println(email); //[krishna@gmail.com, ajay@gmail.com, jenny@gmail.com, mathew@gmail.com]
		
		
		// customer -> customer.getPhoneNumbers() one to many mapping
		// when we have one to many mapping like a nested list where u want to print as single list, then u can go for flat map
		// in the below case the output would be
		// [[983482342, 23423424], [4353543, 565656], [345546546, 23133567], [2342323, 7831557]]
		List<List<String>> phonenumbers = customers.stream().map(customer-> customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phonenumbers);
		
		
		List<String> flatMap = customers.stream().flatMap(customer-> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(flatMap);
		
		
	}

}
