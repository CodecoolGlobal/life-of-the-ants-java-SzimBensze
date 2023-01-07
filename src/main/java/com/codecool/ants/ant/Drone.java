package com.codecool.ants.ant;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Drone extends Ant {
    private Position queenPos;
    public Drone(Position position, int colonyWidth, Position queenPos) {
        super(position, colonyWidth);
        this.queenPos = queenPos;
    }

    @Override
    public void act() {
        int queenX = queenPos.getX();
        int queenY = queenPos.getY();
        if (queenX != position.getX()) {
            if (queenX < position.getX()) position.moveTo(Direction.WEST, 1);
            if (queenX > position.getX()) position.moveTo(Direction.EAST, 1);
        }
        else if (queenY != position.getY()) {
            if (queenY < position.getY()) position.moveTo(Direction.NORTH, 1);
            if (queenY > position.getY()) position.moveTo(Direction.SOUTH, 1);
        }
    }
}
