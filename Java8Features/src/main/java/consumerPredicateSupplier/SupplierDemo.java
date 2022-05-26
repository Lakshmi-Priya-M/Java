package consumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		 Supplier<String> supplier = () -> " Hi lakshmi";
		
		 /* System.out.println(supplier.get()); */
		
		List<String> list1 = Arrays.asList("Hi","lakshmi");
		
		System.out.println(list1.stream().findAny().orElseGet(() -> " supplier"));

	}

}
