package com.projectadmob.gameworld;

import com.projectadmob.gameobjects.Toaster;

/**
 * Created by nisarg on 28/4/16.
 */
public class GameWorld {

    private Toaster mToaster;

    public GameWorld(int gameHeight){
        mToaster = new Toaster(33, gameHeight-12,17,12);
    }

    public void update(float delta){
        mToaster.update(delta);
    }

    public Toaster getToaster(){
        return mToaster;
    }
}
