package consumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		// A consumer is a built in functional interface where it manipulates the argument sent and it doesn't return any object .
		
		/*
		 * Consumer<Integer> consumer = t -> System.out.println("Prints = "+ t);
		 * consumer.accept(10);
		 */
		
		// For each method internally uses consumer method.
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		// this consumer method inside for each internally calls accept method
		/* numbers.stream().forEach(consumer); */
		
		numbers.stream().forEach(t -> System.out.println("Print = "+ t));
		
		
	}

}
