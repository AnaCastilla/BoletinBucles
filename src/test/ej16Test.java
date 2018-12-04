package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.ej16;

class ej16Test {

	@Test
	void reverseTest() {
		assertEquals(ej16.reverse(12345), 54321);
		assertEquals(ej16.reverse(10234), 43201);
		assertEquals(ej16.reverse(1020304), 4030201);
		//assertEquals(ej16.reverse(01234), 4321);

	}
} 
