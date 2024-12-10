package week3day1;

import java.util.Arrays;

public class AssingmentArray {

	public static void main(String[] args) {
		// our question ? find higher /lower value ?in the given num ..
		int num[] = { 1, 2, 6, 4, 2, 3, 1, 5, 2, 8 };
		// we apply Array syntax there? for ascending order given num

		// Arrays.sort(num);
		// System.out.println(num[0]);

		Arrays.sort(num);
		System.out.println(num[num.length - 1]);
	}

}
