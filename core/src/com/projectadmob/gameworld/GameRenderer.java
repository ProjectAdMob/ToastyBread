package com.projectadmob.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.projectadmob.gameobjects.Toaster;
import com.projectadmob.tbhelpers.AssetLoader;

/**
 * Created by nisarg on 28/4/16.
 */
public class GameRenderer {

    private final GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer mShapeRenderer;

    private SpriteBatch batcher;


    private int midPointY;
    private int gameHeight;

    public GameRenderer(GameWorld world,  int gameHeight, int midPointY){

        this.gameHeight = gameHeight;
        this.midPointY = midPointY;

        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);

        batcher = new SpriteBatch();
        // Attach batcher to camera
        batcher.setProjectionMatrix(cam.combined);

        mShapeRenderer = new ShapeRenderer();
        mShapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(float runTime){

        // We will move these outside of the loop for performance later.
        Toaster toaster = myWorld.getToaster();

        // Fill the entire screen with black, to prevent potential flickering.
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Begin ShapeRenderer
        mShapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        // Draw Background color
        mShapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        mShapeRenderer.rect(0, 0, 136, midPointY + 66);

        // Draw Grass
        mShapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
        mShapeRenderer.rect(0, midPointY + 66, 136, 11);

        // Draw Dirt
        mShapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
        mShapeRenderer.rect(0, midPointY + 77, 136, 52);


        // End ShapeRenderer
        mShapeRenderer.end();

        // Begin SpriteBatch
        batcher.begin();
        // Disable transparency
        // This is good for performance when drawing images that do not require
        // transparency.
        batcher.disableBlending();
        batcher.draw(AssetLoader.bg, 0, midPointY + 23, 136, 43);

        // The bird needs transparency, so we enable that again.
        batcher.enableBlending();

        // Draw bird at its coordinates. Retrieve the Animation object from
        // AssetLoader
        // Pass in the runTime variable to get the current frame.
        batcher.draw(AssetLoader.toasterAnimation.getKeyFrame(runTime),
                toaster.getX(), toaster.getY(), toaster.getWidth(), toaster.getHeight());

        // End SpriteBatch
        batcher.end();


    }
}
