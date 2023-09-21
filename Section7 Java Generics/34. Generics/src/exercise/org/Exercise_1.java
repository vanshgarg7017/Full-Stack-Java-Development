package exercise.org;

import java.util.Arrays;

public class Exercise_1 {
public static<T> boolean compareArray(T[]array1,T[]array2) {
	if(array1.length !=array2.length) {
		return false;
	}
	for(int i=0;i<array1.length;i++) {
		if(!array1[i].equals(array2[i])) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	Integer[] arr1= {1,2,3,4};
	Integer[] arr2= {1,2,3,4};
	System.out.println("Orginal Array");
	System.out.println("Array 1: "+Arrays.toString(arr1));
	System.out.println("Array 1: "+Arrays.toString(arr2));
	System.out.println("Compare array1 to array2 ----"+compareArray(arr1, arr2));
}
}
