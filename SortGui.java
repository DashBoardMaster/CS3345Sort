import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SortGui extends Application
{
	int n;
	String datatype;
	String sort;
	int comparisons;
	int movements;
	int totalTime;
	
	public SortGui() 
	{
		n = 0;
		datatype = "";
		sort = "";
		comparisons = 0;
		movements = 0;
		totalTime = 0;
	}
	
	/* Generates 50000 random numbers from 1 to 1000000 
	 * Duplicates allowed
	 * Store in array 
	 */
	public static int[] randomNumberGenerator(int size) 
	{
		int[] rand = new int[size];
		for(int i = 0; i < size; i++)
		{
			rand[i] = ThreadLocalRandom.current().nextInt(1, 1000001);
		}
		return rand;
	}
	
	public static int[] sortedDataGenerator(int size) 
	{
		int[] sorted = new int[size];
		for(int i = 0; i < size; i++)
		{
			sorted[i] = i;
		}
		return sorted;
	}
	
	public static int[] reverseDataGenerator(int size) 
	{
		int[] reverse = new int[size];
		for(int i = 0; i < size; i++)
		{
			reverse[i] = size - i;
		}
		return reverse;
	}
	
	@Override
	public void start(Stage primaryStage) {;
		//primaryStage.setScene(); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}

