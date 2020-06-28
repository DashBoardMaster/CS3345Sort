import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;



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
		Rectangle r1 = new Rectangle(400,200);
		r1.setFill(Color.LIGHTGRAY);
		Rectangle r2 = new Rectangle(200,400);
		r2.setFill(Color.DARKGRAY);
		AnchorPane anchor = new AnchorPane(r1, r2);
		 
		GridPane experimentalResults = new GridPane();
		// experimentalResults.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		experimentalResults.setAlignment(Pos.BOTTOM_RIGHT);
		experimentalResults.add(new Label("N:"), 0, 0);
		experimentalResults.add(new TextField(), 1, 0);
		experimentalResults.add(new Label("DataType:"), 0, 1);
		experimentalResults.add(new TextField(), 1, 1);
		experimentalResults.add(new Label("Sort:"), 0, 2);
		experimentalResults.add(new TextField(), 1, 2);
		experimentalResults.add(new Label("Comparisons:"), 0, 3);
		experimentalResults.add(new TextField(), 1, 3);
		experimentalResults.add(new Label("Movements:"), 0, 4);
		experimentalResults.add(new TextField(), 1, 4);
		experimentalResults.add(new Label("Total time:"), 0, 5);
		experimentalResults.add(new TextField(), 1, 5);

		Scene scene = new Scene(anchor, 200, 250);
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}

