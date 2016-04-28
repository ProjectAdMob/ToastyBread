package com.projectadmob.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.projectadmob.gameworld.GameRenderer;
import com.projectadmob.gameworld.GameWorld;
import com.projectadmob.tbhelpers.InputHandler;

/**
 * Created by nisarg on 13/4/16.
 */
public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2); //Don't need it, but just in case

        world = new GameWorld((int)gameHeight); // initialize world
        renderer = new GameRenderer(world); // initialize renderer

        Gdx.input.setInputProcessor(new InputHandler(world.getToaster())); //Attaching InputProcessor
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void dispose() {
        // Leave blank
    }
}


