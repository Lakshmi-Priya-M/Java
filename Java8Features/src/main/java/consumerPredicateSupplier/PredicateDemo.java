package consumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		/*Predicate<Integer> predicate = t -> {
			if(t%2 == 0)
				return true;
			else
				return false;
		};*/
		
		
		//Predicate<Integer> predicate = t -> t % 2 == 0;
		
		/* System.out.println(predicate.test(10)); */
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		numbers.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.println("Print Even" + t));

	}

}
