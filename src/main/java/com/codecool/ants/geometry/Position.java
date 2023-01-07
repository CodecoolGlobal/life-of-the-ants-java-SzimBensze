package com.codecool.ants.geometry;

public class Position {

    public final int x;
    public final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position moveTo(Direction dir, int amount) {
        int newX = dir.getStepX() * amount;
        int newY = dir.getStepY() * amount;
        return new Position(newX, newY);
    }
}