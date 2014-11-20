/**
 * Test the PrimeNumbersGenerator class using JUnit case test
 */

package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import learning_TDD.Fibonacci;

public class PrimeNumbersGeneratorTest {

	@Test
	//Test the first Prime number 
	public void testPrimeNumberToOne() throws Exception {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals('1', fibonacci.generatorPrimeNumbersto(1));
	}

}
