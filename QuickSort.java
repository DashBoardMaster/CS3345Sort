public class QuickSort {
	static int comparisons = 0;
	static int movements = 0;

	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; // Index for backward search

		while (high > low) {
			// Search forward from left

			while (low <= high && list[low] <= pivot) {
				comparisons++;
				low++;
			}
			// Search backward from right
			while (low <= high && list[high] > pivot) {
				comparisons++;
				high--;
			}
			// Swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
				movements++;
			}
		}

		while (high > first & list[high] >= pivot) {
			comparisons++;
			high--;
		}

		// Swap pivot with list[high]
		comparisons++;
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			movements++;
			return high;
		}
		else {
			return first;
		}
	}
	public static void main(String[] args) {
		QuickSort.comparisons = 0;
		QuickSort.movements = 0;
		System.out.println("Sorted");
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.sortedDataGenerator(i);
			long start = System.nanoTime();
			QuickSort.quickSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(QuickSort.comparisons + " ");
			System.out.print(QuickSort.movements + " ");
			System.out.println(time);
		}
		QuickSort.comparisons = 0;
		QuickSort.movements = 0;
		System.out.println("Reverse");
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.reverseDataGenerator(i);
			long start = System.nanoTime();
			QuickSort.quickSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(QuickSort.comparisons + " ");
			System.out.print(QuickSort.movements + " ");
			System.out.println(time);
		}
		QuickSort.comparisons = 0;
		QuickSort.movements = 0;
		System.out.println("Almost Ordered");
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list1 = SortGui.sortedDataGenerator((int) (i * 0.8));
			int[] list2 = SortGui.sortedDataGenerator((int) (i * 0.2));
			int[] list = new int[list1.length + list2.length];
			System.arraycopy(list1, 0, list, 0, list1.length);  
			System.arraycopy(list2, 0, list, list1.length, list2.length);
			long start = System.nanoTime();
			QuickSort.quickSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(QuickSort.comparisons + " ");
			System.out.print(QuickSort.movements + " ");
			System.out.println(time);
		}
		QuickSort.comparisons = 0;
		QuickSort.movements = 0;
		System.out.println("Random");
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.randomNumberGenerator(i);
			long start = System.nanoTime();
			QuickSort.quickSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(QuickSort.comparisons + " ");
			System.out.print(QuickSort.movements + " ");
			System.out.println(time);
		}
	}
}