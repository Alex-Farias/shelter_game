package org.alex_farias.Main;

import org.alex_farias.Main.layouts.mainLayout;
import org.alex_farias.Main.rules.Rendering;

public class Game implements Rendering {
    private mainLayout layout = new mainLayout();

    public static void main(String[] args) {
        Game game = new Game();
    }

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
