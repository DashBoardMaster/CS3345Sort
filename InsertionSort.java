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
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
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
	public static void main(String[] args) {
		InsertionSort.comparisons = 0;
		InsertionSort.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.sortedDataGenerator(i);
			long start = System.nanoTime();
			InsertionSort.insertionSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(InsertionSort.comparisons + " ");
			System.out.print(InsertionSort.movements + " ");
			System.out.println(time);
		}
		InsertionSort.comparisons = 0;
		InsertionSort.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.reverseDataGenerator(i);
			long start = System.nanoTime();
			InsertionSort.insertionSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(InsertionSort.comparisons + " ");
			System.out.print(InsertionSort.movements + " ");
			System.out.println(time);
		}
		InsertionSort.comparisons = 0;
		InsertionSort.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list1 = SortGui.sortedDataGenerator((int) (i * 0.8));
			int[] list2 = SortGui.randomNumberGenerator((int) (i * 0.2));
			int[] list = new int[list1.length + list2.length];
			System.arraycopy(list1, 0, list, 0, list1.length);
			System.arraycopy(list2, 0, list, list1.length, list2.length);
			long start = System.nanoTime();
			InsertionSort.insertionSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(InsertionSort.comparisons + " ");
			System.out.print(InsertionSort.movements + " ");
			System.out.println(time);
		}
		InsertionSort.comparisons = 0;
		InsertionSort.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.randomNumberGenerator(i);
			long start = System.nanoTime();
			InsertionSort.insertionSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(InsertionSort.comparisons + " ");
			System.out.print(InsertionSort.movements + " ");
			System.out.println(time);
		}
	}
}