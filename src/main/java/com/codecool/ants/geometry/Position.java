package com.codecool.ants.geometry;

import java.util.Random;

public class Position {

    private final int x;

    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Position randomPos(int colonyWidth) {
        Random random = new Random();
        int randX = random.nextInt(colonyWidth);
        int randY = random.nextInt(colonyWidth);
        return new Position(randX, randY);
    }

    public Position moveTo(Direction dir, int amount) {
        int newX = x + dir.getStepX() * amount;
        int newY = y + dir.getStepY() * amount;
        return new Position(newX, newY);
    }
}