package org.alex_farias.Main.layouts;

import org.alex_farias.Main.layouts.huds.Hud;
import org.alex_farias.Main.rules.Rendering;

public class Layout implements Rendering {
    private Hud hud = new Hud();

    public Layout(){

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
