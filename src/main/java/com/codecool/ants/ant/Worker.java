package com.codecool.ants.ant;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Worker extends Ant {
    public Worker(Position position, int colonyWidth) {
        super(position, colonyWidth);
        visual = 'W';
    }

    @Override
    public void act() {
        Direction dir = Direction.randomDirection();
        while (!checkMovement(position.moveTo(dir, 1))) {
            dir = Direction.randomDirection();
        }
        position = position.moveTo(dir, 1);
    }
}
