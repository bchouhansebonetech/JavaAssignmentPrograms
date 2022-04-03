package com.sebone.javaprograms.programsjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.sebone.javaprograms.program.VowelCheckingInString;

public class VowelCheckingInStringTest {

	@Test
	public void isVowelAvailable() {
		VowelCheckingInString vowelCheckingInString = new VowelCheckingInString();
		assertEquals(false, vowelCheckingInString.isVowelAvailable(null));
		assertEquals(true, vowelCheckingInString.isVowelAvailable("bhanu"));
		assertEquals(false, vowelCheckingInString.isVowelAvailable("bcd"));
		assertEquals(false, vowelCheckingInString.isVowelAvailable(""));
	}
	
	@Test
	public void countVowelsInStringTest() {
		VowelCheckingInString vowelCheckingInString = new VowelCheckingInString();
		assertEquals(0, vowelCheckingInString.countVowelsInString(null));
		assertEquals(2, vowelCheckingInString.countVowelsInString("bhanu"));
		assertEquals(0, vowelCheckingInString.countVowelsInString("bcd"));
		assertEquals(0, vowelCheckingInString.countVowelsInString(""));
	}

}
