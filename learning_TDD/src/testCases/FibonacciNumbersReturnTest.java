/**
 * Test the FibonacciNumbersReturn class using JUnit case test
 */

package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import learning_TDD.Fibonacci;

public class FibonacciNumbersReturnTest {

	@Test
	// Test the first fibonacci number
	public void testFibonacciNumberToOne() throws Exception {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals("1", fibonacci.returnFibonacciNumbersTo(1));
	}

	@Test
	// Test the second fibonacci number
	public void testFibonacciNumberToTwo() throws Exception {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals("1", fibonacci.returnFibonacciNumbersTo(2));
	}

}
