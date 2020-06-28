import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;



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
		 FlowPane pane = new FlowPane();
		 pane.setPadding(new Insets(11, 12, 13, 14)); // Size of border of pane
		 pane.setHgap(5); // Horizontal gap 
		 pane.setVgap(5); // Vertical gap
		 // Place nodes in the pane
		 pane.getChildren().addAll(new Label("N:"), new TextField(), 
				 				   new Label("DataType:"), new TextField(),
				 				   new Label("Sort:"), new TextField(),
				 				   new Label("Comparisons:"), new TextField(),
				 				   new Label("Movements:"), new TextField(),
				 				   new Label("Total time:"), new TextField());
		 // Create a scene and place it in the stage
		 Scene scene = new Scene(pane, 200, 250);
		 primaryStage.setTitle("ShowFlowPane"); // Set the stage title
		 primaryStage.setScene(scene); // Place the scene in the stage
		 primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}