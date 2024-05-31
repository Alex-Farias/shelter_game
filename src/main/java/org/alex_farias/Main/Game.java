package org.alex_farias.Main;

import org.alex_farias.Main.Layouts.mainLayout;
import org.alex_farias.Main.Rules.Rendering;

public class Game implements Rendering {
    private mainLayout layout = new mainLayout();

    public Game(){

    }

    public synchronized void start(){

    }

    public synchronized void stop(){

    }

    @Override
    public void tick() {
        layout.tick();
    }

    @Override
    public void render() {
        layout.render();
    }

    private void updateLayout(){

    }
}
