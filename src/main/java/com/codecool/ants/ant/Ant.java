package com.codecool.ants.ant;

import com.codecool.ants.geometry.Position;

public abstract class Ant {
    protected Position position;
    protected char visual;
    protected int colonyWidth;

    public Ant(Position position, int colonyWidth) {
        this.position = position;
        this.colonyWidth = colonyWidth;
    }

    public Position getPosition() {
        return position;
    }

    public char getVisual() {
        return visual;
    }

    public abstract void act();

    protected boolean checkMovement(Position position) {
        return position.getX() > 0 && position.getY() > 0 && position.getX() < colonyWidth && position.getY() < colonyWidth;
    }
}
