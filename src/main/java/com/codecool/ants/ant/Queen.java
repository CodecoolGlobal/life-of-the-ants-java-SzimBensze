package com.codecool.ants.ant;

import com.codecool.ants.geometry.Position;

import java.util.Random;

public class Queen extends Ant {
    Random random = new Random();
    private int cooldown = random.nextInt(10);
    private int matingProgress = 0;
    private int timesMated = 0;

    public Queen(int colonyWidth) {
        super(new Position(colonyWidth / 2, colonyWidth / 2), colonyWidth);
        visual = 'Q';
    }

    @Override
    public void act() {
        if (cooldown > 0) cooldown--;
        if (matingProgress > 0) matingProgress--;
    }

    public boolean getMood() {
        return cooldown == 0;
    }

    public int getMatingProgress() {
        return matingProgress;
    }

    public int getTimesMated() {
        return timesMated;
    }

    public void startMating() {
        timesMated++;
        matingProgress = 10;
        cooldown = 30 + random.nextInt(50);
    }
}
