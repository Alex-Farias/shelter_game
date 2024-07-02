package org.alex_farias.Main;

import org.alex_farias.Main.layouts.Layout;
import org.alex_farias.Main.layouts.windows.Window;
import org.alex_farias.Main.rules.Rendering;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends Canvas implements Rendering, Runnable, MouseListener, KeyListener {
    private int WIDTH, HEIGHT, SCALE;
    private Layout layout = new Layout();
    private Thread thread;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public Game(){
        setWIDTH(480);
        setHEIGHT(270);
        setSCALE(2);

        addKeyListener(this);
        addMouseListener(this);

        this.setPreferredSize(new Dimension(getWIDTH() * getSCALE(), getHEIGHT() * getSCALE()));

        Window window = new Window(this);
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getSCALE() {
        return SCALE;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public void setSCALE(int SCALE) {
        this.SCALE = SCALE;
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

    @Override
    public void run() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
