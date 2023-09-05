# Ant Colony Simulator

## Introduction

This project was a solo homework at my programming school Codecool. It was focusing on learning the basics of OOP principles, it's made completely in Java. The project had to be finished in a week and is about a simulation of a simple ant colony, where there are several roles that ants fulfill, these are Worker, Soldier, Drone and Queen. Each of them have a unique behavior, but all of them inherit the basic features of an Ant. There is no executable (yet), so you have to have a Java compiler to be able execute the code and see it in action. It is a console application, where ants and the map are represented by characters. Each type of ant are it's initials, e.g. 'W' is a worker ant. The program is considered finished and is probably not going to get any updates in the future.

## How to run

The program is written in Java 17 (LTS) and can be run in a Java IDE, I recommend using IntelliJ IDEA. Once you have a work environment of your choice, clone the repository and open the project with it, then navigate to the Main.java and execute the code. If everything is set properly, the output will shop in the console. Please follow the instructions to see it interacting.

Run with command line:

```sh
mvn package
java -jar target/ants-1.0.jar
```

## Technology

As mentioned earlier, the project is fully in Java, it is built with Maven build tool for better compile time and quality and it doesn't use any external libraries or third-party extensions. Here's a UML diagram of how the ant classes are built up:

![image](../development/ants.png)

If interested in the program or anything regarding it feel free to contact me! Please only use my code as educational or personal purpouses, do not copy and redistribute.
