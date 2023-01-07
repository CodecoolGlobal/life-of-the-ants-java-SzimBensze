package com.codecool.ants.geometry;

import java.util.Random;

public enum Direction {
        NORTH, EAST, SOUTH, WEST;

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
    }
