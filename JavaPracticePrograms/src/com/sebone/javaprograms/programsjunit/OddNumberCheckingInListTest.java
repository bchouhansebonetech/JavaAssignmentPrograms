package com.sebone.javaprograms.programsjunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.sebone.javaprograms.program.OddNumberCheckingInList;

class OddNumberCheckingInListTest {

	@Test
	void isOnlyOddAvailableTest() {
		OddNumberCheckingInList oddNumberCheckingInList = new OddNumberCheckingInList();
		assertEquals(false, oddNumberCheckingInList.isOnlyOddAvailable(null));
		assertEquals(true, oddNumberCheckingInList.isOnlyOddAvailable(new ArrayList<Integer>( Arrays.asList(1, 3, 5))));
		assertEquals(false, oddNumberCheckingInList.isOnlyOddAvailable(new ArrayList<Integer>( Arrays.asList(1, 2, 3, 5))));
		assertEquals(false, oddNumberCheckingInList.isOnlyOddAvailable(new ArrayList<Integer>( Arrays.asList(2, 4, 6, 8))));
		assertEquals(false, oddNumberCheckingInList.isOnlyOddAvailable(new ArrayList<Integer>()));
	}

}
