package mapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Database {
	
	public static List<Customer> getAllCustomer() {
		return Stream
				.of(new Customer(101, "krishna", "krishna@gmail.com", Arrays.asList("983482342", "23423424")),
						new Customer(102, "ajay", "ajay@gmail.com", Arrays.asList("4353543", "565656")),
						new Customer(103, "jenny", "jenny@gmail.com", Arrays.asList("345546546", "23133567")),
						new Customer(104, "mathew", "mathew@gmail.com", Arrays.asList("2342323", "7831557")))
				.collect(Collectors.toList());
	}

}
