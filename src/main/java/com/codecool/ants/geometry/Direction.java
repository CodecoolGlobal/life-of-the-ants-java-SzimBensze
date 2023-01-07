package com.codecool.ants.geometry;

import java.util.Random;

public enum Direction {
    NORTH(0, -1),
    EAST(1, 0),
    SOUTH(0, 1),
    WEST(-1, 0);
    private int stepX;
    private int stepY;


    Direction(int stepX, int stepY) {
        this.stepX = stepX;
        this.stepY = stepY;
    }


    Direction randomDirection() {
            Random random = new Random();
            int randDir = random.nextInt(4);
            switch(randDir) {
                case 0: return NORTH;
                case 1: return EAST;
                case 2: return SOUTH;
                case 3: return WEST;
                default: return null;
            }
        }


    public int getStepX() {
        return stepX;
    }


    public int getStepY() {
        return stepY;
    }
}
