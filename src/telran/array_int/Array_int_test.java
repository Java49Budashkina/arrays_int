package telran.array_int;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;

import static telran.array_int.Array_int.*;

import org.junit.jupiter.api.Test;



class Array_int_test {

	@Test
	void testAddNumber() {
		int array1[] = {1, 2, 3};
		int expected1[] = {1, 2, 3, 4};
		assertArrayEquals(expected1, addNumber(array1, 4));
		//how check with empty array????
		/*int array2[] = new int[0];
		int expected2[] = {12};
		assertArrayEquals(expected2, Arrays.copyOf(array2, 12));*/
	}
	@Test
	void testRemoveNumber() {
		int array[] = {1, 2, 3, 4, 5};
		int expected[] = {1, 2, 4, 5};
		assertArrayEquals(expected, removeNumber(array, 2));
		assertArrayEquals(array, removeNumber(array, -1));
		assertArrayEquals(array, removeNumber(array, 5));
	}
	
	@Test
	void testInsertNumber() {
		int array[] = {1, 2, 3, 4, 5};
		int expected[] = {1, 2, 25, 3, 4, 5};
		int expected2[] = {1, 2, 3, 4, 5 ,6};
		
		assertArrayEquals(expected, insertNumber(array, 2, 25));
		assertArrayEquals(array, insertNumber(array, -1, 11));
		assertArrayEquals(array, insertNumber(array, 8, 11));
		assertArrayEquals(expected2, insertNumber(array, 5, 6));
		
	}
	
	@Test
	void testCopyOf() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3};
		int expected2[] = {1};
		int expected3[] = {1, 2, 3, 0, 0, 0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array,6));
	}
	@Test
	void testArraycopy() {
		int array[] = {1, 2, 3};
		int expected[] = {5, 10, 1, 2, 20};
		int arrayDest[] = new int[5];
		arrayDest[4] = 20;
		int array1[] = {2, 5, 10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		
		assertArrayEquals(expected, arrayDest);
	}
	
	@Test

	void testBinarySearchInt() {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 22};
		assertTrue( Arrays.binarySearch(array, 3) == 2);
		assertFalse( Arrays.binarySearch(array, 9) == 3);
		assertTrue( Arrays.binarySearch(array, 10) < 0);
		
		int array1[] = {1,  4, 22, 5, 6, 7, 2, 3, 8};
		assertFalse( Arrays.binarySearch(array1, 22) == 2);
	}

}

