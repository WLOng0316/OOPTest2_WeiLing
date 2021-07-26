package Lab06;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Monster implements Graphics{
	
	private int MonsterWidth;
	private int MonsterHeight;
	private int MonsterPosX;
	private int MonsterPosY;
	private Color MonsterColor;
	private Projectile MonsterProjectile;
	private int ShootX;
	private int ShootY;
	
	public void Monster(int MonsterWidth, int MonsterHeight, Color MonsterColor,int MonsterPosX, int MonsterPosY) {
		this.MonsterWidth = MonsterWidth;
		this.MonsterHeight = MonsterHeight;
		this.MonsterColor = MonsterColor;
		this.MonsterPosX = MonsterPosX;
		this.MonsterPosY = MonsterPosY;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setFill(MonsterColor);
		gc.fillRect(MonsterPosX, MonsterPosY, MonsterWidth, MonsterHeight);
	}
	

	public void chase() {
		
	}
	
	public void shoot() {
		
		
	}
}
