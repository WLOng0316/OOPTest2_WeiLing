package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player implements Pacman, Graphics {
	
	private int PlayerHeight;
	private int PlayerWidth;
	private Color PlayerColor;
	private int PlayerX;
	private int PlayerY;
	private int Life = 3;
	private Score score;

	
	public void setPacmanHeight(int PlayerHeight) {
		this.PlayerHeight = PlayerHeight;
	}
	public void setPacmanWidth(int PlayerWidth) {
		this.PlayerWidth = PlayerWidth;
	}
	
	public void setColour(Color PlayerColor) {
		this.PlayerColor = PlayerColor;
	}
	
	public void setPosX(int PlayerX) {
		this.PlayerX = PlayerX;
	}
	
	public void setPosY(int PlayerY) {
		this.PlayerY = PlayerY;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(PlayerColor);
		gc.fillOval(PlayerX, PlayerY, PlayerWidth, PlayerHeight);
	}
	
	/*public void drawPacman(GraphicsContext gc) {
		gc.setFill(PlayerColor);
		gc.fillOval(PlayerX, PlayerY, PlayerWidth, PlayerHeight);
		
	}*/
	
	public void moveUp(){
		
	}
	public void moveDown(){
		
	}
	public void moveLeft() {
		
	}
	public void moveRight() {
		
	}
	public void eat() {
		
	}
	
	public void lose() {
		Life = Life-1;
		
	}
	public void win() {
		
	}

}