package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicios.ej09;

class ej09Test {

	@Test
	void baseExponentTest() {
		assertEquals(ej09.baseExponent(4, 2), 16);
		assertEquals(ej09.baseExponent(-4, -2), 1);
		assertEquals(ej09.baseExponent(-4, 2), 16);
		assertEquals(ej09.baseExponent(4, -2), 1);
	}

}
