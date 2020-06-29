public class HeapSort {
	/** Heap sort method */
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		// Create a Heap of integers
		Heap<E> heap = new Heap<>();

		// Add elements to the heap
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);

		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}
	public static void main(String[] args) {
		Heap.comparisons = 0;
		Heap.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.sortedDataGenerator(i);
			long start = System.nanoTime();
			HeapSort.heapSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(Heap.comparisons + " ");
			System.out.print(Heap.movements + " ");
			System.out.println(time);
		}
		Heap.comparisons = 0;
		Heap.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.reverseDataGenerator(i);
			long start = System.nanoTime();
			HeapSort.heapSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(Heap.comparisons + " ");
			System.out.print(Heap.movements + " ");
			System.out.println(time);
		}
		Heap.comparisons = 0;
		Heap.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list1 = SortGui.sortedDataGenerator((int) (i * 0.8));
			int[] list2 = SortGui.randomNumberGenerator((int) (i * 0.2));
			int[] list = new int[list1.length + list2.length];
			System.arraycopy(list1, 0, list, 0, list1.length);
			System.arraycopy(list2, 0, list, list1.length, list2.length);
			long start = System.nanoTime();
			HeapSort.heapSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(Heap.comparisons + " ");
			System.out.print(Heap.movements + " ");
			System.out.println(time);
		}
		Heap.comparisons = 0;
		Heap.movements = 0;
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.randomNumberGenerator(i);
			long start = System.nanoTime();
			HeapSort.heapSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.print(Heap.comparisons + " ");
			System.out.print(Heap.movements + " ");
			System.out.println(time);
		}
	}
}
