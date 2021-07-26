package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Bot implements Pacman, Graphics {
	
	private int BotHeight;
	private int BotWidth;
	private Color Botcolor;
	private int BotX;
	private int BotY;
	
	
	public void setPacmanHeight(int BotHeight) {
		this.BotHeight = BotHeight;
	}
	public void setPacmanWidth(int BotWidth) {
		this.BotWidth = BotWidth;
	}
	public void setColour(Color BotColor) {
		this.Botcolor = Botcolor;
	}
	
	public void setPosX(int BotX) {
		this.BotX = BotX;
	}
	
	public void setPosY(int PlayerY) {
		this.BotY = BotY;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(Botcolor);
		gc.fillOval(BotX, BotY, BotWidth, BotHeight);
	}
	
	/*public void drawPacman(GraphicsContext gc) {
		gc.setFill(Botcolor);
		gc.fillOval(BotX, BotY, BotWidth, BotHeight);
		
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

}
