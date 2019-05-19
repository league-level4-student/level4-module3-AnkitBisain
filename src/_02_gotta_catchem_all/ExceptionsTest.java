package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		try {
			em.divide(2.0, 0.0);
		} catch (Exception e) {
			System.out.println("water");
		}
	}
	
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		try{
			em.reverse("");
		} catch(Exception e) {
			System.out.println("ice");
		}
	}
	
	
	

}
