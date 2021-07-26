package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface Pacman {
	
	public void setPacmanHeight(int Height);
	public void setPacmanWidth(int Width);
	public void setColour(Color color);
	public void setPosX(int x);
	public void setPosY(int y);
	//public void drawPacman(GraphicsContext gc);
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
	public void eat();

}
