package com.projectadmob.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by nisarg on 28/4/16.
 */
public class Toaster {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // Do we need it? idk.
    private int width;
    private int height;

    public Toaster(float x, float y, int width, int height){
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 460); //Placeholder
    }


    public void update(float delta) {

        //if(position.y == 0) { //Only jump when ground, for now.

            velocity.add(acceleration.cpy().scl(delta));

            if (velocity.y > 200) {
                velocity.y = 200;
            }

            position.add(velocity.cpy().scl(delta));
        //}

    }

    public void onClick() {
        velocity.y = -140; //Again, placeholder
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }
}
