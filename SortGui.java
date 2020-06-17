import java.util.concurrent.ThreadLocalRandom;

public class SortGui 
{
	private int[] data;
	
	public SortGui() 
	{
		data = randomNumberGenerator();
	}
	
	public SortGui(int[] data) 
	{
		this.data = data;
	}

	public void printData()
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
	public static int[] randomNumberGenerator() 
	{
		int[] rand = new int[10];
		for(int i = 0; i < 10; i++)
		{
			rand[i] = ThreadLocalRandom.current().nextInt(1, 1000001);
		}
		return rand;
	}
	
	public void insertionSort() 
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
	
	public void selectionSort() 
	{
		for(int i = 0; i < data.length; i++)
		{
			int minIndex = i;
			int min = data[minIndex];
			for(int j = i + 1; j < data.length; j++)
			{
				if(data[j] < min)
				{
					min = data[j];
					minIndex = j;
				}
			}
			if (i != minIndex)
			{
				data[i] = data[i] + data[minIndex];
				data[minIndex] = data[i] - data[minIndex];
				data[i] = data[i] - data[minIndex];
			}
		}
	}
	
	public void shellSort() 
	{

	}
	
	public void heapSort() 
	{

	}
	
	public void mergeSort() 
	{	

	}
	
	public void quickSort() 
	{	

	}
	
	public static void main(String[] args) 
	{
		SortGui sortGui = new SortGui();
		System.out.println("Before sorting: ");
		sortGui.printData();
		sortGui.selectionSort();
		System.out.println("After sorting: ");
		sortGui.printData();
	}
}
