package com.codecool.ants;

import com.codecool.ants.ant.*;
import com.codecool.ants.geometry.Position;

import java.util.HashSet;
import java.util.Set;

public class Colony {
    private int width;
    private Set<Ant> ants;
    private Position queenPos;

    public Colony(int width) {
        this.width = width;
        ants = new HashSet<Ant>();
    }

    public void generateAnts(int workers, int soldiers, int drones) {
        Queen queen = new Queen(width);
        queenPos = queen.getPosition();
        ants.add(queen);
        for (int i = 0; i < workers; i++) {
            Worker worker = new Worker(Position.randomPos(width), width);
            ants.add(worker);
        }
        for (int i = 0; i < soldiers; i++) {
            Soldier soldier = new Soldier(Position.randomPos(width), width);
            ants.add(soldier);
        }
        for (int i = 0; i < drones; i++) {
            Drone drone = new Drone(Position.randomPos(width), width, queen);
            ants.add(drone);
        }
    }

    public void update() {
        for (Ant ant : ants) {
            ant.act();
        }
    }

    public void display() {
        String matingText = "";
        String visualised = "";
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < width; x++) {
                char displayChar = '.';
                for (Ant ant : ants) {
                    if (ant.getPosition().getX() == x && ant.getPosition().getY() == y) {
                        displayChar = ant.getVisual();
                    }
                    if (ant instanceof Drone) {
                        switch (((Drone) ant).getStatus()) {
                            case MATING -> matingText = "HALLELUJAH";
                            case KICKED -> matingText = ":(";
                        }
                    }
                }
                visualised += displayChar + " ";
            }
            visualised += "\n";
        }
        System.out.println(visualised);
        if (matingText != "") System.out.println(matingText);
    }
}
