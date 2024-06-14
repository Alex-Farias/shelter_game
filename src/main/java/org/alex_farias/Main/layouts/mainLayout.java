package org.alex_farias.Main.layouts;

import org.alex_farias.Main.layouts.hud.mainHud;
import org.alex_farias.Main.rules.Rendering;

public class mainLayout implements Rendering {
    private mainHud hud = new mainHud();

    public mainLayout(){

    }

    @Override
    public void tick() {
        hud.tick();
    }

    @Override
    public void render() {
        hud.render();
    }
}
