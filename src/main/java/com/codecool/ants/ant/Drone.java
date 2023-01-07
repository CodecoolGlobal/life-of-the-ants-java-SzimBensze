package com.codecool.ants.ant;

import com.codecool.ants.geometry.Direction;
import com.codecool.ants.geometry.Position;

public class Drone extends Ant {
    private final Queen queen;
    private DroneStatusType status = DroneStatusType.MOVING;
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
            status = DroneStatusType.MOVING;
        } else if (queenY != position.getY()) {
            if (queenY < position.getY()) position = position.moveTo(Direction.NORTH, 1);
            if (queenY > position.getY()) position = position.moveTo(Direction.SOUTH, 1);
            status = DroneStatusType.MOVING;
        } else {
            if (!status.equals(DroneStatusType.MATING)) {
                if (queen.getMood()) {
                    if (queen.getMatingProgress() == 0) {
                        status = DroneStatusType.MATING;
                        queen.startMating();
                    }
                }
                else {
                    getKicked();
                    status = DroneStatusType.KICKED;
                }
            }
            else {
                if (queen.getMatingProgress() == 0) {
                    getKicked();
                    status = DroneStatusType.MOVING;
                }
            }
        }
    }

    public DroneStatusType getStatus() {
        return status;
    }

    private void getKicked() {
        Direction dir = Direction.randomDirection();
        position = position.moveTo(dir, colonyWidth / 2);
        status = DroneStatusType.KICKED;
    }
}
