package com.calc.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CalcServiceTest {
	
	CalcService s = new CalcService();

	@Test
	void testAddtestAddTwoPositive() {
		int expected = 2;
		int actual = s.add(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddTwoNegative() {
		int expected = -2;
		int actual = s.add(-1, -1);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddOnePosOneNeg() {
		int expected = 0;
		int actual = s.add(1, -1);
		assertEquals(expected, actual);
	
	}
	@Test
	void testMultestMulTwoPositive() {
		int expected = 4;
		int actual = s.mul(2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMulTwoNegative() {
		int expected = 4;
		int actual = s.mul(-2, -2);
		assertEquals(expected, actual);
	}

	@Test
	public void testMullOnePosOneNeg() {
		int expected = -4;
		int actual = s.mul(2, -2);
		assertEquals(expected, actual);
	
	}
	
	@Test
	void testSubtestSubTwoPositive() {
		int expected = 0;
		int actual = s.sub(2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubTwoNegative() {
		int expected = 0;
		int actual = s.sub(-2, -2);
		assertEquals(expected, actual);
	}

	@Test
	public void testSublOnePosOneNeg() {
		int expected = 4;
		int actual = s.sub(2, -2);
		assertEquals(expected, actual);
	
	}

}
