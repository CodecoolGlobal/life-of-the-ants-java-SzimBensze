package com.codecool.ants.ant;

import com.codecool.ants.geometry.Position;

public class Queen extends Ant {
    public Queen(int colonyWidth) {
        super(new Position(colonyWidth / 2, colonyWidth / 2), colonyWidth);
        visual = 'Q';
    }

    @Override
    public void act() {}
}
