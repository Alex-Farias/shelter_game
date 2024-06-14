package org.alex_farias.Main.layouts.hud;

import org.alex_farias.Main.rules.Rendering;

public class mainHud implements Rendering {
    private double lifeBar;
    private double staminaBar;
    private double magicBar;

    public double getLifeBar() {
        return lifeBar;
    }

    public double getStaminaBar() {
        return staminaBar;
    }

    public double getMagicBar() {
        return magicBar;
    }

    public void setLifeBar(double lifeBar) {
        this.lifeBar = lifeBar;
    }

    public void setStaminaBar(double staminaBar) {
        this.staminaBar = staminaBar;
    }

    public void setMagicBar(double magicBar) {
        this.magicBar = magicBar;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render() {

    }
}
