package com.jad.tron;

import lombok.Getter;


class LightCycle extends AbstractTile implements ILightCycle {
    private final IGrid grid;
    @Getter
    private Direction direction;
    @Getter
    private Position position;
    @Getter
    private boolean alive = true;

    public LightCycle(final char symbol, final Position position, final Direction direction, final IGrid grid) {
        super(symbol, false);
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    @Override
    public void turnRight() {
        this.direction = this.direction.getRight();
    }

    @Override
    public void turnLeft() {
        this.direction = this.direction.getLeft();
    }

    @Override
    public void move() {
        if (this.alive) {
            this.position = this.grid.wrapPosition(this.position.getFrontPosition(this.direction));
        }
        if (!this.grid.isTraversableAt(this.position)) {
            this.dead();
        }
        this.grid.setTileAt(this, this.position);
    }

    private void dead() {
        this.alive = false;
    }
}
