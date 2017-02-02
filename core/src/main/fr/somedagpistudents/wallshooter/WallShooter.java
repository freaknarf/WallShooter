package fr.somedagpistudents.wallshooter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import fr.somedagpistudents.wallshooter.screen.GameScreen;
import fr.somedagpistudents.wallshooter.screen.PresentationScreen;
import fr.somedagpistudents.wallshooter.tools.Controller;
import fr.somedagpistudents.wallshooter.world.InputController;
import fr.somedagpistudents.wallshooter.world.World;
import fr.somedagpistudents.wallshooter.world.WorldRenderer;

public class WallShooter extends Game {
	public final static int SCREEN_WIDTH = 1280;
	public final static int SCREEN_HEIGHT = 720;
	public static final boolean DEBUG_DEFAULT = true;

    public static GameScreen gameScreen ;

    public static boolean debug;

    @Override
	public void create() {
		WallShooter.debug = DEBUG_DEFAULT;

		Controller controller = new Controller(this);
		GameScreen gameScreen = new GameScreen(this,controller);
		this.setScreen(new PresentationScreen(this,controller));
	}

	public static void toggleDebug() {
		WallShooter.debug = ! WallShooter.debug;
	}


}
