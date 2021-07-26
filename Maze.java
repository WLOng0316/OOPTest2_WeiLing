package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Maze implements Graphics{
	
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.RED);
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(5);
		gc.strokeLine(0,180,100,180); 
		gc.strokeLine(150, 0, 150, 100);
		gc.strokeLine(230, 250, 230, 100);
		gc.strokeLine(200, 600, 200, 300);
		gc.strokeLine(300,200,600,200); 
	}
	

}
