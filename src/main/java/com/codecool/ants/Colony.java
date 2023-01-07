package com.codecool.ants;

import com.codecool.ants.ant.Ant;
import com.codecool.ants.geometry.Position;

import java.util.HashSet;
import java.util.Set;

public class Colony {
    private int width;
    private Set<Ant> ants;
    private String visualised;
    private Position queenPos;

    public Colony(int width) {
        this.width = width;
        ants = new HashSet<Ant>();
    }
}
