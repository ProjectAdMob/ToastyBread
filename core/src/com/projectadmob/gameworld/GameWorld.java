package com.projectadmob.gameworld;

import com.projectadmob.gameobjects.Toaster;

/**
 * Created by nisarg on 28/4/16.
 */
public class GameWorld {

    private Toaster mToaster;

    public GameWorld(int midPointY){
        mToaster = new Toaster(15, midPointY,17,12);
    }

    public void update(float delta){
        mToaster.update(delta);
    }

    public Toaster getToaster(){
        return mToaster;
    }
}
