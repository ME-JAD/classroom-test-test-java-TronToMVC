package com.jad.tron;

public record Position(int x, int y) {
    public Position getFrontPosition(final Direction direction) {
        return switch (direction) {
            case UP -> new Position(this.x, this.y - 1);
            case DOWN -> new Position(this.x, this.y + 1);
            case LEFT -> new Position(this.x - 1, this.y);
            case RIGHT -> new Position(this.x + 1, this.y);
        };
    }

    public Position getLeftPosition(final Direction direction) {
        return switch (direction) {
            case UP -> new Position(this.x - 1, this.y);
            case DOWN -> new Position(this.x + 1, this.y);
            case LEFT -> new Position(this.x, this.y + 1);
            case RIGHT -> new Position(this.x, this.y - 1);
        };
    }

    public Position getRightPosition(final Direction direction) {
        return switch (direction) {
            case UP -> new Position(this.x + 1, this.y);
            case DOWN -> new Position(this.x - 1, this.y);
            case LEFT -> new Position(this.x, this.y - 1);
            case RIGHT -> new Position(this.x, this.y + 1);
        };
    }
}
