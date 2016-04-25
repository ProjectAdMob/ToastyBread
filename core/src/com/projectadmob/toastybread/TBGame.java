package com.projectadmob.toastybread;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.projectadmob.screens.GameScreen;

public class TBGame extends Game {


	@Override
	public void create () {
		Gdx.app.log("TBGame", "created");
		setScreen(new GameScreen());

	}
}
