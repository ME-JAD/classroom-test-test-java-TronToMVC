package com.jad.tron;

public enum Direction {
    UP(0),
    RIGHT(1),
    DOWN(2),
    LEFT(3);

    private final int value;

    Direction(final int value) {
        this.value = value;
    }

    public static Direction getRandom() {
        return Direction.values()[(int) (Math.random() * Direction.values().length)];
    }

    public Direction getRight() {
        return Direction.values()[(this.value + 1) % Direction.values().length];
    }

    public Direction getLeft() {
        return Direction.values()[(this.value + Direction.values().length - 1) % Direction.values().length];
    }
}
