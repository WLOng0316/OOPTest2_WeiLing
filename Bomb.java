package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Bomb implements Graphics{
	
	private int BombHeight;
	private int BombWidth;
	private Color BombColor;
	private int BombPosX;
	private int BombPosY;
	private int detectX;
	private int detectY;
	private Player playerLife;
	
	public void Bomb(int BombHeight, int BombWidth, Color BombColor, int BombPosX,int BombPosY) {
		this.BombHeight = BombHeight;
		this.BombWidth = BombWidth;
		this.BombColor = BombColor;
		this.BombPosX = BombPosX;
		this.BombPosY = BombPosY;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(BombColor);
		gc.fillRect(BombPosX, BombPosY, BombWidth, BombHeight);
	}
	
	
	// if posPlayerX&Y is in the range of bomb then life-1
	public void bomb(int detectX, int detectY) {
		if (detectX> BombPosX & detectX<BombWidth & detectY>BombPosY & detectY<BombHeight) {
			playerLife.lose();
		}
		
		
	}
	

}
