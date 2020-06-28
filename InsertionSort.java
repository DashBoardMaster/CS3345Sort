public class InsertionSort {
	static int comparisons = 0;
	static int movements = 0;

	/** The method for sorting the numbers */
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that
          list[0..i] is sorted. */
			int currentElement = list[i];
			int k;
			for (k = i - 1; k >= 0 & list[k] > currentElement; k--) {
				comparisons++;
				// Shift element
				list[k + 1] = list[k];
				movements++;
			}

			// Insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			movements++;
		}
	}
}