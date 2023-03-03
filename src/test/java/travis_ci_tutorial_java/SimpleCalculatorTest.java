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
	public void testAddByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 0), 1);
	}
	
	@Test
	public void testMinusFixed() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMinusByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(1, 0), 1);
	}
	
	@Test 
	public void testMultFixed() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(4, 4), 16);
	}
	
	@Test
	public void testMultFixed1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(4, 5), 20);
	}
	
	@Test
	public void testMultByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(1, 0), 0);
	}
	
	@Test 
	public void testDivideFixed() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(8, 4), 2);
	}
	
	@Test
	public void testDivideFixed1() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 4), 1);
	}
	
}
