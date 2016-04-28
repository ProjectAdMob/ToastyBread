package com.projectadmob.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by nisarg on 28/4/16.
 */
public class GameRenderer {

    private final GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer mShapeRenderer;

    public GameRenderer(GameWorld world){
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);
        mShapeRenderer = new ShapeRenderer();
        mShapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(){

        //Clear background
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


    }
}
