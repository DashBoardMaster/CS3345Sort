import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SortGui extends Application
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

