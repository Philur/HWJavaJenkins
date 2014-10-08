package com.nuwan;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void testMain() {
		
		assertEquals("Hi All", Program.createMessage());
	}

}
