package org.alex_farias.Main.layouts.windows;

import org.alex_farias.Main.Game;

import javax.swing.*;

public class Window {
    public Window(Game game) {
        JFrame frame = new JFrame("Shelter Game");
        frame.add(game);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
