package com.jad.tron;

import java.util.Random;

public class AIPlayer extends AbstractPlayer {
    private static final String DEFAULT_NAME = "AI";
    private static int counter = 0;

    public AIPlayer() {
        super(AIPlayer.getNewName());
    }

    private static String getNewName() {
        return AIPlayer.DEFAULT_NAME + AIPlayer.counter++;
    }

    @Override
    public void play() {
        if (!this.isForwardTraversable()) {
            if (new Random().nextBoolean()) {
                if (this.isLeftTraversable()) {
                    ILightCycle.turnLeft(this.getLightCycle());
                } else if (this.isRightTraversable()) {
                    ILightCycle.turnRight(this.getLightCycle());
                }
            } else {
                if (this.isRightTraversable()) {
                    ILightCycle.turnRight(this.getLightCycle());
                } else if (this.isLeftTraversable()) {
                    ILightCycle.turnLeft(this.getLightCycle());
                }
            }
        }
    }

    private boolean isForwardTraversable() {
        Position forwardPosition = ILightCycle.getPosition(this.getLightCycle()).getFrontPosition(
                ILightCycle.getDirection(this.getLightCycle()));
        return IGrid.isTraversableAt(this.getGrid(), forwardPosition);
    }

    private boolean isLeftTraversable() {
        Position leftPosition = ILightCycle.getPosition(this.getLightCycle()).getLeftPosition(
                ILightCycle.getDirection(this.getLightCycle()));
        return IGrid.isTraversableAt(this.getGrid(), leftPosition);
    }

    private boolean isRightTraversable() {
        Position rightPosition = ILightCycle.getPosition(this.getLightCycle()).getRightPosition(
                ILightCycle.getDirection(this.getLightCycle()));
        return IGrid.isTraversableAt(this.getGrid(), rightPosition);
    }
}
