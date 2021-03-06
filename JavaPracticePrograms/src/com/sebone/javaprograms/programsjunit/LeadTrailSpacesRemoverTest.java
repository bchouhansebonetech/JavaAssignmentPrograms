package com.sebone.javaprograms.programsjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sebone.javaprograms.program.LeadTrailSpacesRemover;

class LeadTrailSpacesRemoverTest {

	@Test
	void removeLeadTrailSpacesFromStringTest() {
		LeadTrailSpacesRemover leadTrailSpacesRemover = new LeadTrailSpacesRemover();
		
		assertEquals(null, leadTrailSpacesRemover.removeLeadTrailSpacesFromString(null));
		assertEquals("", leadTrailSpacesRemover.removeLeadTrailSpacesFromString(""));
		assertEquals("", leadTrailSpacesRemover.removeLeadTrailSpacesFromString("         "));
		assertEquals("i am genius", leadTrailSpacesRemover.removeLeadTrailSpacesFromString("     i am genius          "));
		assertEquals("i", leadTrailSpacesRemover.removeLeadTrailSpacesFromString("     i           "));
	}

}
