package com.nuwan;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void testMain() {
		
		assertEquals("Hi All", Program.createMessage());
	}

	@Test
	public void testMain1() {
		
		assertEquals("Hi All 1", Program.createMessage());
	}
}
