package com.codecool.ants;

import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("You can use `mvn package; java -jar target/ants-1.0.jar` to run this app from the console");
        Colony colony = new Colony(11);
        colony.generateAnts(6, 3, 2);
        simulateColony(colony);
    }

    public static void simulateColony(Colony colony) {
        int round = 1;
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("----------- Round "+ round + "-----------\n");
            colony.display();
            colony.update();
            round++;
            sc.nextLine();
            System.out.println("next");
        }
    }

    public static void quit() throws InterruptedException {
        System.out.println("Simulation is quitting.");
        Thread.sleep(2000);
    }

}
