package com.sebone.javaprograms.programsjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sebone.javaprograms.program.SpacesRemoverFromString;

class SpacesRemoverFromStringTest {

	@Test
	void removingSpacesFromStringTest() {
		SpacesRemoverFromString spacesRemoverFromString = new SpacesRemoverFromString();
		
		assertEquals(null, spacesRemoverFromString.removingSpacesFromString(null));
		assertEquals("bhanusingh", spacesRemoverFromString.removingSpacesFromString("bhanu singh"));
		assertEquals("i", spacesRemoverFromString.removingSpacesFromString("        i    "));
		assertEquals("", spacesRemoverFromString.removingSpacesFromString(" "));
	}

}
