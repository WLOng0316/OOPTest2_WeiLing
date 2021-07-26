package Lab06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Pacman_2 extends Application {
	
	public int numberOfPlayer;
	public int posPlayerX_1 = 0;

	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.WHITE);
		
		BorderPane borderPane = new BorderPane();
		
		
		Maze maze = new Maze();
		Bomb bomb1 = new Bomb();
		Food food1 = new Food();
		Monster monster1 = new Monster();
		Bot bot1 = new Bot();
		
		Canvas canvas = new Canvas(600,600);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		// Draw Maze
		maze.draw(gc);
		
		// Bot that competes with Pacman for food
		bot1.setColour(Color.CORAL);
		bot1.setPacmanHeight(30);
		bot1.setPacmanWidth(30);
		bot1.setPosX(300);
		bot1.setPosY(0);
		bot1.draw(gc);
	
		// Food
		food1.Food(300,310,320, 100,90,100,Color.RED);
		food1.draw(gc);
		
		// Monster
		monster1.Monster(30, 30, Color.SLATEBLUE, 110, 110);
		monster1.draw(gc);
		
		// Bomb
		bomb1.Bomb(50, 50, Color.DARKGREEN, 30, 300);
		bomb1.draw(gc);

		// Function that create player
		CreatePlayer(gc);
		

		borderPane.setCenter(canvas);
		root.getChildren().add(borderPane);
		
		stage.setHeight(420); //important
		stage.setWidth(420); //important
		stage.setResizable(false);
		stage.setTitle("Pacman-2"); //important
		Image image = new Image("Pacman.png"); //important
		stage.getIcons().add(image);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public void CreatePlayer(GraphicsContext gc) {
		// Request number of players from user
		// According to the number obtained, create new object for player class
		// Example if there is 2 players then 2 players will be created:
		
		numberOfPlayer = 2;
		
		//Player 1
		Player player1 = new Player();
		Player player2 = new Player();
		player1.setColour(Color.BLUE);
		player1.setPacmanHeight(30);
		player1.setPacmanWidth(30);
		player1.setPosX(posPlayerX_1);
		player1.setPosY(0);
		player1.draw(gc);
		
		// Player 2
		player2.setColour(Color.BROWN);
		player2.setPacmanHeight(30);
		player2.setPacmanWidth(30);
		player2.setPosX(posPlayerX_1+50);
		player2.setPosY(0);
		player2.draw(gc);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
