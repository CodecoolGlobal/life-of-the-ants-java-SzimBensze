package com.codecool.ants.ant;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Soldier extends Ant {
    private Direction dir = Direction.NORTH;

    public Soldier(Position position, int colonyWidth) {
        super(position, colonyWidth);
        visual = 'S';
    }

    @Override
    public void act() {
        dir = dir.turnLeft();
        while (!checkMovement(position.moveTo(dir, 1))) {
            dir = dir.turnLeft();
        }
        position = position.moveTo(dir, 1);
    }
}
