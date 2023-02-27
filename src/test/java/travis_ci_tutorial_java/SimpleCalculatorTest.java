package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinusFixed() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
		@Test 
	public void testMultError() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(4, 4), 16);
	}
	
	@Test
	public void testMultError1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(4, 4), 16);
	}
	
	@Test 
	public void testDivideError() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(8, 4), 2);
	}
	
	@Test
	public void testDivideError1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(8, 4), 2);
	}
}
