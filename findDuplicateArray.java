package week3day1;

import java.lang.reflect.Array; //? 
import java.util.Arrays;        //? this import method was automaticaly created sir !

public class findDuplicateArray {

	public static void main(String[] args) {

		// write program find a duplicate num
		int[] num = { 1, 2, 5, 1, 8, 3, 2, 5, 6, 9, 5, 1, 2 };

		Arrays.sort(num);
		// ascend the given number 
		for (int i = 0; i < num.length - 1; i++) {
			// nxt step we cerate  for loop for iteration 
			if (num[i] == num[i + 1]) {
				//if method iterate the value one to one 
				// after we  found duplicate number 
				System.out.println("duplicate element");
				System.out.println();
				
			}

		}

		// there we add in nesterd method

	}
}
