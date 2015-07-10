package com.r0cketp0p.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.r0cketp0p.GameMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Popes and Penguins";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new GameMain(), config);
	}
}
