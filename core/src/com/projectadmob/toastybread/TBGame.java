package com.projectadmob.toastybread;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.projectadmob.screens.GameScreen;
import com.projectadmob.tbhelpers.AssetLoader;

public class TBGame extends Game {


	@Override
	public void create () {
		Gdx.app.log("TBGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen());

	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
