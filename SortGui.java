import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SortGui extends Application
{
	int[] data;
	
	public SortGui() 
	{
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
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}

