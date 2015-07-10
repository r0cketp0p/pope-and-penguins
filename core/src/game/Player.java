package game;

import com.badlogic.gdx.math.Rectangle;

public class Player {
	
	private Rectangle playerRectangle;
	private static int PLAYER_HEIGHT = 64;
	private static int PLAYER_WIDTH = 64;
	
	private void createPlayerRectangle(){
		
		playerRectangle = new Rectangle();
		playerRectangle.x = PLAYER_WIDTH;
		playerRectangle.y = PLAYER_HEIGHT;
		
	}
	
	public void createPlayer() {
		createPlayerRectangle();
	}
	
	
}
