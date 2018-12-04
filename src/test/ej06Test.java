package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.ej06;

class ej06Test {

	@Test
	void sumTest() {
		assertEquals(ej06.sum(4, 2), 6);
		assertEquals(ej06.sum(4, -2), 2);
		assertEquals(ej06.sum(-4, -2), -6);
		assertEquals(ej06.sum(4, 0), 4);
		assertEquals(ej06.sum(0, 4), 4);
		assertNotEquals(ej06.sum('a', 'a'), " ");
	}
	
	@Test
	void subtractTest() {
		assertEquals(ej06.subtract(4, 2), 2);
		assertEquals(ej06.subtract(4, -2), 6);
		assertEquals(ej06.subtract(-4, -2), -2);
		assertEquals(ej06.subtract(4, 0), 4);
		assertEquals(ej06.subtract(0, 4), -4);
		assertNotEquals(ej06.subtract('a', 'a'), " ");
	}
	
	@Test
	void multiply() {
		assertEquals(ej06.multiply(4, 2), 8);
		assertEquals(ej06.multiply(4, -2), -8);
		assertEquals(ej06.multiply(-4, -2), 8);
		assertEquals(ej06.multiply(4, 0), 0);
		assertEquals(ej06.multiply(0, 4), 0);
		assertNotEquals(ej06.multiply('a', 'a'), " ");
	}
	
	@Test
	void divide() {
		assertEquals(ej06.divide(4, 2), 2);
		assertEquals(ej06.divide(4, -2), -2);
		assertEquals(ej06.divide(-4, -2), 2);
		assertEquals(ej06.divide(4, 0), 0);
		assertEquals(ej06.divide(0, 4), 0);
		assertNotEquals(ej06.divide('a', 'a'), " ");
	}
	

}
