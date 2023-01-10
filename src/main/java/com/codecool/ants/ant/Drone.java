package com.codecool.ants.ant;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Drone extends Ant {
    private final Queen queen;
    private DroneStatus status = DroneStatus.MOVING;
    public Drone(Position position, int colonyWidth, Queen queen) {
        super(position, colonyWidth);
        visual = 'D';
        this.queen = queen;
    }

    @Override
    public void act() {
        int queenX = queen.getPosition().getX();
        int queenY = queen.getPosition().getY();
        if (queenX != position.getX()) {
            if (queenX < position.getX()) position = position.moveTo(Direction.WEST, 1);
            if (queenX > position.getX()) position = position.moveTo(Direction.EAST, 1);
            status = DroneStatus.MOVING;
        } else if (queenY != position.getY()) {
            if (queenY < position.getY()) position = position.moveTo(Direction.NORTH, 1);
            if (queenY > position.getY()) position = position.moveTo(Direction.SOUTH, 1);
            status = DroneStatus.MOVING;
        } else {
            if (!status.equals(DroneStatus.MATING)) {
                if (queen.getMood()) {
                    if (queen.getMatingProgress() == 0) {
                        status = DroneStatus.MATING;
                        queen.startMating();
                    }
                }
                else {
                    beKicked();
                    status = DroneStatus.KICKED;
                }
            }
            else {
                if (queen.getMatingProgress() == 0) {
                    beKicked();
                    status = DroneStatus.MOVING;
                }
            }
        }
    }

    public DroneStatus getStatus() {
        return status;
    }

    private void beKicked() {
        Direction dir = Direction.randomDirection();
        position = position.moveTo(dir, colonyWidth / 2);
        status = DroneStatus.KICKED;
    }
}
