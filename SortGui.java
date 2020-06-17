import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortGui 
{
	public int[] data;
	
	public SortGui() 
	{
		data = new int[50];
	}
	
	public SortGui(int[] data) 
	{
		this.data = data;
	}

	void printData()
	{
		for(int i = 0; i < data.length; i++)
		{
			if (i == data.length - 1)
			{
				System.out.print(data[i]);
			}
			else
			{
				System.out.print(data[i] + ",");
			}			
		}
		System.out.println();
	}
	
	/* Generates 50000 random numbers from 1 to 1000000 
	 * Duplicates allowed
	 * Store in array 
	 */
	static int[] randomNumberGenerator() 
	{
		int[] rand = new int[10];
		for(int i = 0; i < 10; i++)
		{
			rand[i] = ThreadLocalRandom.current().nextInt(1, 1000001);
		}
		return rand;
	}
	
	void insertionSort() 
	{
		for(int i = 1; i < data.length; i++)
		{
			for(int j = i - 1; j >= 0; j--)
			{
				if(data[j] > data[i]) 
				{
					// Swap values
					data[i] = data[i] + data[j];
					data[j] = data[i] - data[j];
					data[i] = data[i] - data[j];
					// Decrement i
					i--; 
				}
			}
		}
	}
	
	void selectionSort() 
	{

	}
	
	void shellSort() 
	{

	}
	
	void heapSort() 
	{

	}
	
	void mergeSort() 
	{	

	}
	
	void quickSort() 
	{	

	}
	
	public static void main(String[] args) 
	{
		SortGui sortGui = new SortGui(randomNumberGenerator());
		System.out.println("Before sorting: ");
		sortGui.printData();
		sortGui.insertionSort();
		System.out.println("After sorting: ");
		sortGui.printData();
	}
}
