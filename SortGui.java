import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;



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
		Canvas canvas = new Canvas(400,  300);
		
		
		Rectangle2D screenBounds = Screen.getPrimary().getBounds();
		
		Rectangle sortButtonList = new Rectangle(screenBounds.getMaxX() / 3, screenBounds.getMaxY());
		sortButtonList.setFill(Color.LIGHTGRAY);
		
		Rectangle winningAlgorithm = new Rectangle(screenBounds.getMaxX() * 2 / 3, screenBounds.getMaxY() * 2 / 16);
		winningAlgorithm.setFill(Color.LIGHTGRAY);
		
		Rectangle listProperties = new Rectangle(screenBounds.getMaxX() * 2 / 3, screenBounds.getMaxY() * 7 / 16);
		listProperties.setFill(Color.LIGHTGRAY);
		
		Rectangle experimentalResults = new Rectangle(screenBounds.getMaxX() * 2 / 3, screenBounds.getMaxY() * 7 / 16);
		experimentalResults.setFill(Color.LIGHTGRAY);
		
		AnchorPane anchor = new AnchorPane(sortButtonList, winningAlgorithm, listProperties, experimentalResults);
		anchor.setStyle("-fx-border-color: white");
		
		AnchorPane.setTopAnchor(sortButtonList, 0.0);
		AnchorPane.setLeftAnchor(sortButtonList, 0.0);
		AnchorPane.setTopAnchor(winningAlgorithm, 0.0);
		AnchorPane.setRightAnchor(winningAlgorithm, 0.0);
		AnchorPane.setTopAnchor(listProperties, screenBounds.getMaxY() * 2 / 16);
		AnchorPane.setRightAnchor(listProperties, 0.0);
		AnchorPane.setBottomAnchor(experimentalResults, 0.0);
		AnchorPane.setRightAnchor(experimentalResults, 0.0);
		 
		GridPane experimentalResultsButtons = new GridPane();
		// experimentalResults.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		experimentalResultsButtons.setAlignment(Pos.BOTTOM_RIGHT);
		experimentalResultsButtons.add(new Label("N:"), 0, 0);
		experimentalResultsButtons.add(new TextField(), 1, 0);
		experimentalResultsButtons.add(new Label("DataType:"), 0, 1);
		experimentalResultsButtons.add(new TextField(), 1, 1);
		experimentalResultsButtons.add(new Label("Sort:"), 0, 2);
		experimentalResultsButtons.add(new TextField(), 1, 2);
		experimentalResultsButtons.add(new Label("Comparisons:"), 0, 3);
		experimentalResultsButtons.add(new TextField(), 1, 3);
		experimentalResultsButtons.add(new Label("Movements:"), 0, 4);
		experimentalResultsButtons.add(new TextField(), 1, 4);
		experimentalResultsButtons.add(new Label("Total time:"), 0, 5);
		experimentalResultsButtons.add(new TextField(), 1, 5);

		Scene scene = new Scene(anchor, 200, 250);
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}

