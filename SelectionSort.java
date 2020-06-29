public class SelectionSort {
	/** The method for sorting the numbers */
	static int comparisons = 0;
	static int movements = 0;

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j =i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					comparisons++;
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
	
	public static void main(String[] args) {
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.randomNumberGenerator(i);
			long start = System.nanoTime();
			SelectionSort.selectionSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("Size: " + i);
			System.out.print(SelectionSort.comparisons + " ");
			System.out.print(SelectionSort.movements + " ");
			System.out.println(time);
		}
	}
}
