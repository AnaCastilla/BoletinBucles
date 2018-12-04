package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.ej02;

class ej02Test {

	@Test
	void sumProductTest() {
		assertEquals(ej02.sumProduct(2, 5), 10);
		assertNotEquals(ej02.sumProduct(-2, -5), -10);
		assertNotEquals(ej02.sumProduct(-2, 5), " ");
		assertNotEquals(ej02.sumProduct('a', 'a'), " ");
	}

}
