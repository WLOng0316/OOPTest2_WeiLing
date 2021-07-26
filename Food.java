package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Food implements Graphics{
	
	private int FoodWidth;
	private int FoodHeight;
	private Color FoodColor;
	private int FoodPosX1;
	private int FoodPosX2;
	private int FoodPosX3;
	private int FoodPosY;
	private int FoodPosY2;
	private int FoodPosY3;
	
	public void Food(int FoodPosX1, int FoodPosX2, int FoodPosX3, int FoodPosY, int FoodPosY2, int FoodPosY3, Color FoodColor) {
		this.FoodPosX1 = FoodPosX1;
		this.FoodPosX2 = FoodPosX2;
		this.FoodPosX3 = FoodPosX3;
		this.FoodPosY = FoodPosY;
		this.FoodPosY2 = FoodPosY2;
		this.FoodPosY3 = FoodPosY3;
		this.FoodColor = FoodColor;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(FoodColor);
		double [] triangleX = {FoodPosX1,FoodPosX2,FoodPosX3};
		double [] triangleY = {FoodPosY,FoodPosY2,FoodPosY3};
		gc.fillPolygon(triangleX, triangleY, 3);
	}
	

	

}
