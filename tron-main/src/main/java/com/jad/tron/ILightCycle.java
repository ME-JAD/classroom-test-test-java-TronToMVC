package com.jad.tron;

public interface ILightCycle {

    static void turnRight(ILightCycle lightCycle) {
        lightCycle.turnRight();
    }

    void turnRight();

    static void turnLeft(ILightCycle lightCycle) {
        lightCycle.turnLeft();
    }

    void turnLeft();

    static Position getPosition(ILightCycle lightCycle) {
        return lightCycle.getPosition();
    }

    Position getPosition();

    static Direction getDirection(ILightCycle lightCycle) {
        return lightCycle.getDirection();
    }

    Direction getDirection();

    boolean isAlive();

    void move();

}
