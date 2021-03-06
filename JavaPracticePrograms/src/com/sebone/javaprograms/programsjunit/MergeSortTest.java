package com.sebone.javaprograms.programsjunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.sebone.javaprograms.program.MergeSort;

class MergeSortTest {

	@Test
	void mergeSortArray() {
		MergeSort mergeSort = new MergeSort();
		
		assertEquals(null, mergeSort.mergeSortArray(null, 0, 0));
		assertArrayEquals(new ArrayList<Integer>(Arrays.asList(1, 3, 22, 45, 64, 88)).toArray(), mergeSort.mergeSortArray(new ArrayList<Integer>(Arrays.asList(1, 45, 64, 3, 22, 88)), 0, 5).toArray());
		assertArrayEquals(new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12)).toArray(), mergeSort.mergeSortArray(new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12)), 0, 5).toArray());
		assertArrayEquals(new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9)).toArray(), mergeSort.mergeSortArray(new ArrayList<Integer>(Arrays.asList(9, 7, 5, 3, 1)), 0, 4).toArray());
	}

}
