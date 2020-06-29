import java.util.*;
class RadixSort {
	static int comparisons = 0;
	static int movements = 0;

	static int getMax(int arr[], int n){

		int mx = arr[0];
		for (int i = 1; i < n; i++) {
			comparisons++;
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}
		return mx;
	}
	static void countSort(int arr[], int n, int exp) {
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count,0);
		for (i = 0; i < n; i++)
			count[ (arr[i]/exp)%10 ]++;
		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++) 
			count[i] += count[i - 1];
		// Build the output array
		for(i = n - 1; i >= 0; i--) {
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
			count[ (arr[i]/exp)%10 ]--;
			movements++;
		}
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}
	static void radixSort(int arr[], int n)
	{ // Find the maximum number to know number of digits
		int m = getMax(arr, n);
		for (int exp = 1; m/exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}
	static void print(int arr[], int n) {
		for (int i = 0; i< n; i++)
			System.out.print(arr[i]+" ");
	}
//	public static void main(String[] args) {
//		RadixSort.comparisons = 0;
//		RadixSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list = SortGui.sortedDataGenerator(i);
//			long start = System.nanoTime();
//			RadixSort.radixSort(list, list.length);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(RadixSort.comparisons + " ");
//			System.out.print(RadixSort.movements + " ");
//			System.out.println(time);
//		}
//		RadixSort.comparisons = 0;
//		RadixSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list = SortGui.reverseDataGenerator(i);
//			long start = System.nanoTime();
//			RadixSort.radixSort(list, list.length);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(RadixSort.comparisons + " ");
//			System.out.print(RadixSort.movements + " ");
//			System.out.println(time);
//		}
//		RadixSort.comparisons = 0;
//		RadixSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list1 = SortGui.sortedDataGenerator((int) (i * 0.8));
//			int[] list2 = SortGui.randomNumberGenerator((int) (i * 0.2));
//			int[] list = new int[list1.length + list2.length];
//			System.arraycopy(list1, 0, list, 0, list1.length);
//			System.arraycopy(list2, 0, list, list1.length, list2.length);
//			long start = System.nanoTime();
//			RadixSort.radixSort(list, list.length);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(RadixSort.comparisons + " ");
//			System.out.print(RadixSort.movements + " ");
//			System.out.println(time);
//		}
//		RadixSort.comparisons = 0;
//		RadixSort.movements = 0;
//		for(int i = 10; i < 10001; i *= 10)
//		{
//			int[] list = SortGui.randomNumberGenerator(i);
//			long start = System.nanoTime();
//			RadixSort.radixSort(list, list.length);
//			long end = System.nanoTime();
//			long time = end - start;
//			System.out.print(RadixSort.comparisons + " ");
//			System.out.print(RadixSort.movements + " ");
//			System.out.println(time);
//		}
//	}
}