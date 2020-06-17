import java.util.Arrays;
public class SortGui 
{
	int[] data;
	public SortGui() 
	{
		data = new int[50];
	}
	public SortGui(int[] data) 
	{
		this.data = data;
	}
	
	void insertionSort() 
	{
		for(int i = 1; i < data.length; i++)
		{
			int elementToSort = data[i];
			int indexToInsert = i;
			for(int j = 0; j < i; j++)
			{
				if(data[j] > data[i]) 
				{
					indexToInsert = j;
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
    
	}
}
