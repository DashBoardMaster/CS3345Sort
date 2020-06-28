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
	
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(anchor, 200, 250);
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}

