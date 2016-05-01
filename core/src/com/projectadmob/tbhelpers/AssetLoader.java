package com.projectadmob.tbhelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by nisarg on 1/5/16.
 */
public class AssetLoader {

    public static Texture texture;
    public static TextureRegion bg, floor;

    public static Animation toasterAnimation;
    public static TextureRegion toaster, toasterDown, toasterUp;

    public static TextureRegion skullUp, skullDown, bar;

    public static void load() {

        texture = new Texture(Gdx.files.internal("data/texture.png"));
        texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        bg = new TextureRegion(texture, 0, 0, 97, 48);
        bg.flip(false, true);

        floor = new TextureRegion(texture, 0, 48, 97, 6);
        floor.flip(false, true);

        toasterDown = new TextureRegion(texture, 97, 0, 30, 24);
        toasterDown.flip(false, true);

        toaster = new TextureRegion(texture, 97, 0, 30, 24);
        toaster.flip(false, true);

        toasterUp = new TextureRegion(texture, 97, 0, 30, 24);
        toasterUp.flip(false, true);

        TextureRegion[] toasters = { toasterDown, toaster, toasterUp };
        toasterAnimation = new Animation(0.06f, toasters);
        toasterAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
    }

    public static void dispose() {
        // We must dispose of the texture when we are finished.
        texture.dispose();
    }
}
