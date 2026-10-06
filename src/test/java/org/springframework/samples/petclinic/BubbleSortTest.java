package org.springframework.samples.petclinic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

	private BubbleSort bubbleSort;

	@BeforeEach
	void setUp() {
		bubbleSort = new BubbleSort();
	}

	@AfterEach
	void tearDown() {
		bubbleSort = null;
	}

	@Test
	@DisplayName("CP1 - arreglo vacío")
	void testEmptyArray() {
		// Arrange
		int[] vet = {};
		int[] expected = {};

		// Act
		bubbleSort.bubbleSort(vet);

		// Verify
		assertArrayEquals(expected, vet);
	}

	@Test
	@DisplayName("CP2 - arreglo ya ordenado")
	void testAlreadySortedArray() {
		// Arrange
		int[] vet = { 1, 2 };
		int[] expected = { 1, 2 };

		// Act
		bubbleSort.bubbleSort(vet);

		// Verify
		assertArrayEquals(expected, vet);
	}

	@Test
	@DisplayName("CP3 - arreglo desordenado")
	void testUnsortedArray() {
		// Arrange
		int[] vet = { 2, 1 };
		int[] expected = { 1, 2 };

		// Act
		bubbleSort.bubbleSort(vet);

		// Verify
		assertArrayEquals(expected, vet);
	}

}