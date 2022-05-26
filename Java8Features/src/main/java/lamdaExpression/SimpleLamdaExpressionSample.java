package lamdaExpression;

interface LamdaExpressionInterface{
	// non parameterised method
	
	/* void switchon(); */
	
	// parameterised method
	// void sum(int input);
	
	int subtract(int a1, int a2);
	
}
public class SimpleLamdaExpressionSample{
	
	public static void main(String[] args) {
		
		// () -> {body}
		
		// Simple lamda expression example
		// Only for functional interface, you can use lamda expression
		// Advantage : 
		// 1. It reduces the code lines and code maintenance is easy.
		// 2. It reduces the boiler plate code
		// 3. no need to write repeated syntax
		
		/*
		 * Calculator calculator = () -> System.out.println("Switch On");
		 * calculator.switchon();
		 */
		
		/*
		 * Calculator calculator = (input) -> System.out.println("sum = "+ input);
		 * calculator.sum(4);
		 */
		
		// method with return type
		/*
		 * Calculator calculator = (a1, a2) -> {return a2-a1;};
		 * System.out.println("Subtract = " + calculator.subtract(8, 20));
		 */
		
		// we can optimize the code without return type as it is an one line code
		
		/*
		 * Calculator calculator = (a1, a2) -> a2-a1; System.out.println("Subtract = " +
		 * calculator.subtract(8, 20));
		 */
		
		// Example of some more business logic
		LamdaExpressionInterface calculator = (a1, a2) -> {
			if(a1> a2)
				throw new RuntimeException("message");
			else
				return a2-a1; 
		};
		
		System.out.println("Subtract = " + calculator.subtract(8, 20));
	}
}
