package parallelSort.examples;

import java.util.Arrays;

public class ParallelArraySortingExample {

	public static void main(String[] args) {
		int[] my_array = {5, 8, 1, 0, 6, 9, 50, -3};

		for (int i : my_array) {
			System.out.print( i + " ");
		}
		
		Arrays.parallelSort(my_array);
		
		System.out.println();
		
		for (int i : my_array) {
			System.out.print( i + " ");
		}
	}
}
