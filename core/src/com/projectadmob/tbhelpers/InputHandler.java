package com.projectadmob.tbhelpers;

import com.badlogic.gdx.InputProcessor;
import com.projectadmob.gameobjects.Toaster;

/**
 * Created by nisarg on 28/4/16.
 */
public class InputHandler implements InputProcessor {

    private Toaster mToaster;

    public InputHandler(Toaster toaster){
        mToaster = toaster;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        mToaster.onClick();
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
