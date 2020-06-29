public class SelectionSort {
	/** The method for sorting the numbers */
	static int comparisons = 0;
	static int movements = 0;

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				comparisons++;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				comparisons++;
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				movements++;
			}
		}
	}
//	public static void main(String[] args) {
//		SelectionSort.comparisons = 0;
//		SelectionSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list = SortGui.sortedDataGenerator(i);
//			long start = System.nanoTime();
//			SelectionSort.selectionSort(list);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(SelectionSort.comparisons + " ");
//			System.out.print(SelectionSort.movements + " ");
//			System.out.println(time);
//		}
//		SelectionSort.comparisons = 0;
//		SelectionSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list = SortGui.reverseDataGenerator(i);
//			long start = System.nanoTime();
//			SelectionSort.selectionSort(list);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(SelectionSort.comparisons + " ");
//			System.out.print(SelectionSort.movements + " ");
//			System.out.println(time);
//		}
//		SelectionSort.comparisons = 0;
//		SelectionSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list1 = SortGui.sortedDataGenerator((int) (i * 0.8));
//			int[] list2 = SortGui.randomNumberGenerator((int) (i * 0.2));
//			int[] list = new int[list1.length + list2.length];
//			System.arraycopy(list1, 0, list, 0, list1.length);
//			System.arraycopy(list2, 0, list, list1.length, list2.length);
//			long start = System.nanoTime();
//			SelectionSort.selectionSort(list);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(SelectionSort.comparisons + " ");
//			System.out.print(SelectionSort.movements + " ");
//			System.out.println(time);
//		}
//		SelectionSort.comparisons = 0;
//		SelectionSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list = SortGui.randomNumberGenerator(i);
//			long start = System.nanoTime();
//			SelectionSort.selectionSort(list);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(SelectionSort.comparisons + " ");
//			System.out.print(SelectionSort.movements + " ");
//			System.out.println(time);
//		}
//	}
}
