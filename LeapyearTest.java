package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leap.LeapYear;

public class LeapyearTest {
	LeapYear l=new LeapYear();

	@Test
	public void LeapYearDivisibleby400() {
		
		assertTrue(l.calculateLeapYear(2000));
		
	}
	
	@Test
	public void Leapyeardivisibleby100butnotBy400() {
		assertFalse(l.calculateLeapYear(1700));
	}
	
	@Test
	public void LeapYeardivisibleBy4butnotby100() {
		assertTrue(l.calculateLeapYear(2016));
	}
	
	@Test
	public void NotDivisibleby4() {
		assertFalse(l.calculateLeapYear(2018));	
	}
	
}
