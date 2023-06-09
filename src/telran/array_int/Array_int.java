package telran.array_int;

import java.util.Arrays;

public class Array_int  {
	public static int [] addNumber(int[] array, int num) {
		int newArray[] = Arrays.copyOf(array, array.length+1);
		newArray[newArray.length-1] = num;
		
		return newArray;
	}
	
	public static int [] removeNumber(int[] array, int index) {
		//remove num at a given index
		//if index > len = return old
		//Sysytem.copy
		int len = array.length;
		if((index < 0) || (index >= len))
		{
			return array;
		}
		int newArray[] = new int[len-1];
		System.arraycopy(array, 0, newArray, 0, index);
		System.arraycopy(array, index+1, newArray, index, len - index-1);
		
				 
		return newArray;
	}
	
	public static int [] insertNumber(int[] array,int index, int num) {
		//insert num at a given index for right index value
		//Sysytem.copy
		int len = array.length;
		if((index < 0) || (index > len))
		{
			return array;
		}
		if (index == len)
		{
			return addNumber(array, num);
		}
		
		int newArray[] = new int[len+1];
		System.arraycopy(array, 0, newArray, 0, index);
		newArray[index] = num;
		System.arraycopy(array, index, newArray, index+1, len - index);
						 
		return newArray;
		
	}
	
	public static int[] inseartNumberSorted(int[] arr, int value) {
		int index = Arrays.binarySearch(arr, value);
		if(index <0)
		{
			index = -index -1;
		}
		return insertNumber(arr, index, value);
	
	}
}

