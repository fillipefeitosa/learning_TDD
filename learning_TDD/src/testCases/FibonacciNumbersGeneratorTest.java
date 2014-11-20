/**
 * Test the FibonacciNumbersGenerator class using JUnit case test
 */

package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import learning_TDD.Fibonacci;

public class FibonacciNumbersGeneratorTest {

	@Test
	// Test the first fibonacci number
	public void testFibonacciNumberToOne() throws Exception {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals('1', fibonacci.generatorFibonacciNumbersTo(1));
	}

}
