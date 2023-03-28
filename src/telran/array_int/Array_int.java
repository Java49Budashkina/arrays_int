package telran.array_int;

import java.util.Arrays;

public class Array_int  {
	public static int [] addNumber(int[] array, int num) {
		int newArray[] = Arrays.copyOf(array, array.length+1);
		newArray[newArray.length-1] = num;
		System.out.print("\n Add \n");
		for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");
	 
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
		
		System.out.print("\n Remove\n");
		 for (int i = 0; i < newArray.length; i++)
	            System.out.print(newArray[i] + " ");
		 
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
			addNumber(array, num);
		
		int newArray[] = new int[len+1];
		System.arraycopy(array, 0, newArray, 0, index);
		newArray[index] = num;
		System.arraycopy(array, index, newArray, index+1, len - index);
		
		System.out.print("\n Inseart\n");
		 for (int i = 0; i < newArray.length; i++)
	            System.out.print(newArray[i] + " ");
		 
		return newArray;
		
	}
}

