package org.alex_farias.Main.Layouts;

import org.alex_farias.Main.Layouts.HUD.mainHud;
import org.alex_farias.Main.Rules.Rendering;

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
